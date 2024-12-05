package com.github.lsantana32.roleAndPermissionSystem.logic;

import com.github.lsantana32.roleAndPermissionSystem.persistence.PersistenceController;
import java.util.List;

public class LogicController {

    PersistenceController pc = new PersistenceController();
    
    public User validateUser(String userName, String password) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword(password);
        
        return pc.validateUser(user);
    }   

    public List<User> getUsers() {
        return pc.getUsers();
    }


}
