package com.github.lsantana32.roleAndPermissionSystem.ui;

import com.github.lsantana32.roleAndPermissionSystem.logic.LogicController;
import com.github.lsantana32.roleAndPermissionSystem.logic.User;
import com.github.lsantana32.roleAndPermissionSystem.ui.PrincipalAdmin;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ModifyWindow extends javax.swing.JFrame {
    
    CustomWindow customWindow = new CustomWindow();
    PrincipalAdmin principalAdmin;
    User userModify;
    LogicController lc = new LogicController();
    
    public ModifyWindow(User user, String userLabel) {
        initComponents();
        principalAdmin = new PrincipalAdmin(userLabel);
        userModify= user;
        txtUsername.setText(user.getUsername());
        CbRole.setSelectedItem(user.getaRole().getRoleName());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        CbRole = new javax.swing.JComboBox<>();
        btmConfirm = new javax.swing.JButton();
        btmCancel = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmpw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Modify User");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Username :");

        jLabel4.setText("Password :");

        jLabel5.setText("Confirm Password :");

        jLabel6.setText("Role :");

        CbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user", "admin"}));

        btmConfirm.setText("CONFIRM");
        btmConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmConfirmActionPerformed(evt);
            }
        });

        btmCancel.setText("CANCEL");
        btmCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btmCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(btmConfirm))
                            .addComponent(CbRole, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword)
                            .addComponent(txtConfirmpw)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConfirmpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmConfirm)
                    .addComponent(btmCancel))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //------------------------------------------------------------------------------------------------------------------
    // INTERFACE USER CODE
    //------------------------------------------------------------------------------------------------------------------
    private void btmConfirmActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String confirmPw = String.valueOf(txtConfirmpw.getPassword());
        String role = CbRole.getSelectedItem().toString();
        if (!validateInput(username, password, confirmPw, role)){
            return;
        }
        modifyUser(username, password, role);
    }

    private void btmCancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        principalAdmin.setVisible(true);
        principalAdmin.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbRole;
    private javax.swing.JButton btmCancel;
    private javax.swing.JButton btmConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmpw;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables


    //------------------------------------------------------------------------------------------------------------------
    //  REUSED/REFACTOR CODE
    //------------------------------------------------------------------------------------------------------------------

    private boolean validateInput(String username, String password, String confirmPw, String role) {
        boolean isValid = true;
        if(lc.getUsernamesExcept(userModify.getUsername()).contains(username)){
            customWindow.viewMessage("The username is already taken, please choice another.", "Error", "Error: Invalid username");
            isValid = false;
        }
        if (password.isEmpty() || confirmPw.isEmpty()){
            customWindow.viewMessage("The password cannot be an empty record", "Error", "Error: Empty password");
            isValid = false;
        }
        if (password.equals(String.valueOf(userModify.getPassword())) && username.equals(userModify.getUsername()) && role.equals(userModify.getaRole().getRoleName())){
            customWindow.viewMessage("You need to modify a record to continue", "Error", "Error: No modify");
            isValid = false;
        }
         if (!password.equals(confirmPw)){
            customWindow.viewMessage("Both passwords must be the same", "Error", "Error: Different passwords");
            isValid = false;
        }
        return isValid;
    }

    private void modifyUser(String username, String password, String role) {
        lc.modifyUser(userModify.getId(), username, password, role);
        customWindow.viewMessage("The user has been modified successfully", "Info", "Modify successfully");
        WindowUtils.openWindow(principalAdmin);
        WindowUtils.closeWindow(this);
    }

}
