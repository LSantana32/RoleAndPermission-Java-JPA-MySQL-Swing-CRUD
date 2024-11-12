package com.github.lsantana32.roleAndPermissionSystem.persistence;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.github.lsantana32.roleAndPermissionSystem.logic.Role;
import com.github.lsantana32.roleAndPermissionSystem.logic.User;
import com.github.lsantana32.roleAndPermissionSystem.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;


public class UserJpaController implements Serializable {

    public UserJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public UserJpaController() {
        emf = Persistence.createEntityManagerFactory("roleAndPermissionPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(User user) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Role aRole = user.getaRole();
            if (aRole != null) {
                aRole = em.getReference(aRole.getClass(), aRole.getId());
                user.setaRole(aRole);
            }
            em.persist(user);
            if (aRole != null) {
                aRole.getUsers().add(user);
                aRole = em.merge(aRole);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(User user) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            User persistentUser = em.find(User.class, user.getId());
            Role aRoleOld = persistentUser.getaRole();
            Role aRoleNew = user.getaRole();
            if (aRoleNew != null) {
                aRoleNew = em.getReference(aRoleNew.getClass(), aRoleNew.getId());
                user.setaRole(aRoleNew);
            }
            user = em.merge(user);
            if (aRoleOld != null && !aRoleOld.equals(aRoleNew)) {
                aRoleOld.getUsers().remove(user);
                aRoleOld = em.merge(aRoleOld);
            }
            if (aRoleNew != null && !aRoleNew.equals(aRoleOld)) {
                aRoleNew.getUsers().add(user);
                aRoleNew = em.merge(aRoleNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = user.getId();
                if (findUser(id) == null) {
                    throw new NonexistentEntityException("The user with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            User user;
            try {
                user = em.getReference(User.class, id);
                user.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The user with id " + id + " no longer exists.", enfe);
            }
            Role aRole = user.getaRole();
            if (aRole != null) {
                aRole.getUsers().remove(user);
                aRole = em.merge(aRole);
            }
            em.remove(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<User> findUserEntities() {
        return findUserEntities(true, -1, -1);
    }

    public List<User> findUserEntities(int maxResults, int firstResult) {
        return findUserEntities(false, maxResults, firstResult);
    }

    private List<User> findUserEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(User.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public User findUser(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(User.class, id);
        } finally {
            em.close();
        }
    }
    
    public User findUserWithUserName(String username)throws NoResultException {
        EntityManager em = getEntityManager();
        try {
            //create a query with SQL
            Query q= em.createQuery("SELECT u FROM User u WHERE u.username= :username");
            //set username parameter
            q.setParameter("username", username);
            //save the result in a Object class. The column "username" is unique, so not have 2 users with the same username
            Object o = q.getSingleResult();
            //return the result of the query, converting this from an Object class to a User Class  
            return (User) o;
        }catch (NoResultException e){
            throw e;
        }finally {
            em.close();
        }
    }

    public int getUserCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<User> rt = cq.from(User.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
