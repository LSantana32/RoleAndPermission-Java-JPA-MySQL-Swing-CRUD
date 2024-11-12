package com.github.lsantana32.roleAndPermissionSystem.persistence;

import com.github.lsantana32.roleAndPermissionSystem.logic.User;

import javax.persistence.NoResultException;

public class PersistenceController {
    
    UserJpaController ujc = new UserJpaController();
    RoleJpaController rjc = new RoleJpaController();
    
    public String validateUser(User user) {
        String message;
        try {
            User userBD= ujc.findUserWithUserName(user.getUsername());
            if (userBD.getPassword().equals(user.getPassword())){
                message = "Welcome "+user.getUsername();
            }
            else {
                message = "The password is incorrect";
            }
        }catch (NoResultException e){
            message = "The user "+user.getUsername()+" no exists";
        }
        return message;
    }

   
    
}
