package com.github.lsantana32.roleAndPermissionSystem.persistence;

import com.github.lsantana32.roleAndPermissionSystem.logic.Role;
import com.github.lsantana32.roleAndPermissionSystem.logic.User;
import com.github.lsantana32.roleAndPermissionSystem.persistence.exceptions.NonexistentEntityException;
import com.github.lsantana32.roleAndPermissionSystem.persistence.exceptions.WrongPasswordException;
import java.util.List;

import javax.persistence.NoResultException;

public class PersistenceController {
    
    UserJpaController ujc = new UserJpaController();
    RoleJpaController rjc = new RoleJpaController();
    
    public User validateUser(User user) {
        String message;
        try {
            User userBD= ujc.findUserWithUserName(user.getUsername());
            if (userBD.getPassword().equals(user.getPassword())){
                return userBD;
            }
            else {
                throw new WrongPasswordException();
            }
        }catch (NoResultException e){
            throw e;
        }
    }

    public List<User> getUsers() {
        return ujc.findUserEntities();
    }

    public void registerUser(User user) {
        ujc.create(user);
    }

    public Role getRole(String role) {
        List<Role> roles = rjc.findRoleEntities();
        Role result=null;
        for (Role aRole : roles){
            if (aRole.getRoleName().equals(role)){
                result = aRole;         
            }
        }
        return result;
    }

    public void deleteUser(int id) throws NonexistentEntityException {
        ujc.destroy(id);
    }
}
