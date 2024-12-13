package com.github.lsantana32.roleAndPermissionSystem;

import com.github.lsantana32.roleAndPermissionSystem.ui.Login;
import com.github.lsantana32.roleAndPermissionSystem.ui.WindowUtils;

public class LoginMain {

    public static void main(String[] args) {        
        Login login = new Login();
        WindowUtils.openWindow(login);
    }
}
