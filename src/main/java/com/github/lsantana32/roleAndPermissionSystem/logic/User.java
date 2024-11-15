package com.github.lsantana32.roleAndPermissionSystem.logic;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(unique=true)
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn(name="fk_role")
    private Role aRole;
    
    public User(){}

    public User(int id, String username, String password, Role aRole) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.aRole = aRole;
    }

    public Role getaRole() {
        return aRole;
    }

    public void setaRole(Role aRole) {
        this.aRole = aRole;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
