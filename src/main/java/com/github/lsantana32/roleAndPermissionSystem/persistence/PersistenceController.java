package com.github.lsantana32.roleAndPermissionSystem.persistence;

import com.github.lsantana32.roleAndPermissionSystem.logic.User;
import com.github.lsantana32.roleAndPermissionSystem.persistence.exceptions.WrongPasswordException;

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
}
