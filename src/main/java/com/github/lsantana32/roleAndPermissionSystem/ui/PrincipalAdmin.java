package com.github.lsantana32.roleAndPermissionSystem.ui;

import com.github.lsantana32.roleAndPermissionSystem.logic.LogicController;
import com.github.lsantana32.roleAndPermissionSystem.logic.User;
import com.github.lsantana32.roleAndPermissionSystem.persistence.exceptions.NonexistentEntityException;
import java.util.List;

import javax.swing.table.DefaultTableModel;


public class PrincipalAdmin extends javax.swing.JFrame {
    
    LogicController lc = new LogicController();
    CustomWindow cw = new CustomWindow();

    public PrincipalAdmin(String userName) {
        initComponents();
        labelUsername.setText(userName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        btmDelete = new javax.swing.JButton();
        btmRegister = new javax.swing.JButton();
        btmRefresh = new javax.swing.JButton();
        btmModify = new javax.swing.JButton();
        btmExit = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("USER ADMINISTRATION SYSTEM");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableUsers);

        btmDelete.setText("DELETE");
        btmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmDeleteActionPerformed(evt);
            }
        });

        btmRegister.setText("REGISTER");
        btmRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRegisterActionPerformed(evt);
            }
        });

        btmRefresh.setText("REFRESH");
        btmRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRefreshActionPerformed(evt);
            }
        });

        btmModify.setText("MODIFY");
        btmModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmModifyActionPerformed(evt);
            }
        });

        btmExit.setText("EXIT");
        btmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btmRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btmExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmModify, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btmRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btmDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btmModify, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btmExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        labelUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUsername.setText("User type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void btmExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        WindowUtils.closeWindow(this);
    }

    private void btmRefreshActionPerformed(java.awt.event.ActionEvent evt) {                                           
        loadTable();
    }

    private void btmModifyActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (!validateTable()) {
            return;
        }
        int id = Integer.parseInt(String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(), 0)));
        modifyUser(id);
    }

    private void btmDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (!validateTable()) {
            return;
        }
        int id = Integer.parseInt(String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(), 0)));
        deleteUser(id);
    }

    private void btmRegisterActionPerformed(java.awt.event.ActionEvent evt) {                                            
        RegisterWindow rw = new RegisterWindow(labelUsername.getText());
        WindowUtils.openWindow(rw);
        WindowUtils.closeWindow(this);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        loadTable();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmDelete;
    private javax.swing.JButton btmExit;
    private javax.swing.JButton btmModify;
    private javax.swing.JButton btmRefresh;
    private javax.swing.JButton btmRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTable tableUsers;
    // End of variables declaration//GEN-END:variables

    //------------------------------------------------------------------------------------------------------------------
    // REUSED/REFACTOR CODE
    //------------------------------------------------------------------------------------------------------------------

    private void loadTable() {
        //define the model of the table
        DefaultTableModel modelTable = new DefaultTableModel(){
            //that rows and columns aren't editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //set the column names
        String titles[]={"ID","Username","Role"};
        modelTable.setColumnIdentifiers(titles);
        
        //get the user lists from bd
        List<User> users = lc.getUsers();
        //ask if the list is empty
        if (users!=null){
            //to run a list
            for (User user: users){
                Object[] object = {user.getId(),user.getUsername(),user.getaRole().getRoleName()};
                modelTable.addRow(object);
            }
        }
        tableUsers.setModel(modelTable);
    }


    private boolean validateTable(){
        boolean isValid = true;
        if(!(tableUsers.getRowCount() >0)) {
            cw.viewMessage("There are no records to modify", "Error", "Error: No records");
            isValid= false;
          }
        if (tableUsers.getSelectedRow() == -1){
            cw.viewMessage("Please select a record", "Error", "Error: No selection");
            isValid= false;
        }
        return isValid;
    }

    private void deleteUser(int id){
        lc.deleteUser(id);
        cw.viewMessage("Successful user deletion","Info","Delete Successful");
        loadTable();
    }

    private void modifyUser(int id){
        User user = lc.findUser(id);
        ModifyWindow mw = new ModifyWindow(user ,labelUsername.getText());
        WindowUtils.openWindow(mw);
        WindowUtils.closeWindow(this);
    }
}




