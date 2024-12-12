package com.github.lsantana32.roleAndPermissionSystem.logic;

import com.github.lsantana32.roleAndPermissionSystem.persistence.PersistenceController;
import com.github.lsantana32.roleAndPermissionSystem.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.HashMap;
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
    
    public List<String> getUsernames(){
        List <User> users = getUsers();
        List <String> usernames = new ArrayList<>();
        for (User user : users){
            usernames.add(user.getUsername());
        }
            return usernames;
        }

    public void registerUser(String username, String password, String role) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setaRole(pc.getRole(role));
        pc.registerUser(user);
    }

    public void deleteUser(int id) throws NonexistentEntityException {
        pc.deleteUser(id);
    }
}
