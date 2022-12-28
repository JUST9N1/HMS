package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package view;
//import package
import java.sql.*;
import javax.swing.*;

import javax.swing.JOptionPane;

// import org.netbeans.lib.awtextra.AbsoluteLayout;


//controllers
import controller.UserController;

import models.User;

/**
 *
 * @author khadk
 */
public class Login extends javax.swing.JFrame {
    Connection conn;
    private String role;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
//role
        Role = new javax.swing.ButtonGroup();
        askPass = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        eText1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pText1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adminRadio = new javax.swing.JRadioButton();
        userRadio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        askPass.setMinimumSize(new java.awt.Dimension(450, 350));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel8.setText("Supervisor Login");

        eText1.setBackground(java.awt.Color.black);
        eText1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        eText1.setForeground(java.awt.Color.white);
        eText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eText1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel9.setText("Password");

        pText1.setBackground(java.awt.Color.black);
        pText1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        pText1.setForeground(java.awt.Color.white);
        pText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pText1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel10.setText("Id");

        submitBtn.setBackground(new java.awt.Color(51, 51, 255));
        submitBtn.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout askPassLayout = new javax.swing.GroupLayout(askPass.getContentPane());
        askPass.getContentPane().setLayout(askPassLayout);
        askPassLayout.setHorizontalGroup(
            askPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, askPassLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(askPassLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(askPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(pText1)
                    .addComponent(eText1)
                    .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        askPassLayout.setVerticalGroup(
            askPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, askPassLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HMS");
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setText("SIGN IN");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 4, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 190, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel3.setText("Access Your Account");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 4, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 370, 40));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 180, -1));

        eText.setBackground(java.awt.Color.black);
        eText.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        eText.setForeground(java.awt.Color.white);
        jPanel1.add(eText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 290, 40));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 180, -1));

        pText.setBackground(java.awt.Color.black);
        pText.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        pText.setForeground(java.awt.Color.white);
        pText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTextActionPerformed(evt);
            }
        });
        jPanel1.add(pText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 300, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("SIGN UP");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 180, -1));

        loginbtn.setBackground(new java.awt.Color(0, 0, 0));
        loginbtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(0, 255, 255));
        loginbtn.setText("Login");
        loginbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 4, true));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 170, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("About us");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 4, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 140, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setText("Forgot Password ?");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 230, -1));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setText("PLEASE SELECT YOUR ROLE");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 360, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Don't have an account ?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        Role.add(adminRadio);
        adminRadio.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        adminRadio.setForeground(new java.awt.Color(255, 0, 102));
        adminRadio.setText("ADMIN");
        adminRadio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 4, true));
        jPanel1.add(adminRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        Role.add(userRadio);
        userRadio.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        userRadio.setForeground(new java.awt.Color(255, 0, 102));
        userRadio.setText("USER");
        userRadio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 4, true));
        jPanel1.add(userRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Login_pic.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       new Register().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed

        String role= null;
        if(adminRadio.isSelected()){
            role="admin";
        }else if(userRadio.isSelected()){
            role="user";
        }
        if(role=="admin"){
            askPass.setVisible(true);
        }
        else if(role=="user"){

            if(eText.getText().equals("") || pText.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Please fill all the fields");
            }else{
                try {
                    User s1 = new User(null, null, null, eText.getText(), null, pText.getText(), null, null, null, null,role);
                    UserController sc= new UserController();
                    ResultSet isInserted = sc.selectLogin(s1);
                    
                    if(isInserted.next()){
                        JOptionPane.showMessageDialog(this,"Login Successfully");
                        int result = sc.UpdateStatus(s1);
                        int resul1 = sc.changestatus(s1);
                        dispose();
                        new UserDashboard().setVisible(true);
                    }
                    else{
                        System.out.println("Failed to login ");
                        
                    }
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        else if(role==null){
            JOptionPane.showMessageDialog(this,"Please choose a role");
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void pTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new ResetPass().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pText1ActionPerformed

    private void eText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eText1ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if(eText1.getText().equals("1") & pText1.getText().equals("1")){
            if(eText.getText().equals("") || pText.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Please fill all the fields");
            }else{
                try {
                    String role= null;
        if(adminRadio.isSelected()){
            role="admin";
        }else if(userRadio.isSelected()){
            role="user";
        }
                    System.out.println(role);
                    User s1 = new User(null, null, null, eText.getText(), null, pText.getText(), null, null, null, null,role);
                    UserController sc= new UserController();
                    ResultSet isInserted = sc.selectLogin(s1);
                    
                    if(isInserted.next()){
                        JOptionPane.showMessageDialog(null,"Login Successfully");
                        int result = sc.UpdateStatus(s1);
                        int resul1 = sc.changestatus(s1);
                        askPass.dispose();
                        dispose();
                        new AdminDashboard().setVisible(true);
        
                    }
                    else{
                        System.out.println("Failed to login ");
                        
                    }
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Role;
    private javax.swing.JRadioButton adminRadio;
    private javax.swing.JFrame askPass;
    private javax.swing.JTextField eText;
    private javax.swing.JTextField eText1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JTextField pText;
    private javax.swing.JTextField pText1;
    private javax.swing.JButton submitBtn;
    private javax.swing.JRadioButton userRadio;
    // End of variables declaration//GEN-END:variables
}
