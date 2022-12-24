package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

//importing libraries
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

// import org.netbeans.lib.awtextra.AbsoluteLayout;
//IMPORTING DATABASE CONTROLLERS
import controller.AppointmentController;
import controller.UserController;
import database.db;
import models.Appointment;
import models.User;

/**
 *
 * @author khadk
 */
public class addApointment extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    Statement smt;
    /**
     * Creates new form addApointment
     */
    public addApointment() {
        initComponents();
        UpdateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genderText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        locationText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        appointText = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SpecialText = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        contactBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//panels
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(java.awt.Color.lightGray);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
//labels
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Please fill up the given details");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 390, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Full Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, 40));

        nameText.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        nameText.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        jPanel4.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 300, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Age");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 210, 40));

        ageText.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });
        jPanel4.add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 300, 40));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Gender");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, 40));

        genderText.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        genderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextActionPerformed(evt);
            }
        });
        jPanel4.add(genderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 300, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Location");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 210, 40));
//text
        locationText.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        locationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTextActionPerformed(evt);
            }
        });
        jPanel4.add(locationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 300, 40));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Appointment Time");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 210, 40));
        jPanel4.add(appointText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 300, 40));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Phone no.");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 130, 40));

        phoneText.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });
        jPanel4.add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 300, 40));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Specialist");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 130, 40));
//buttons
        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update Appointment");
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 230, 80));

        jButton2.setBackground(java.awt.Color.black);
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Add Appointment");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 280, 80));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View Appointment");
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 230, 80));

        SpecialText.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        SpecialText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Specialist" }));
        jPanel4.add(SpecialText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 300, 40));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/iccon.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("HMS");

        homeBtn.setBackground(new java.awt.Color(0, 0, 0));
        homeBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 153, 0));
        homeBtn.setText("HOME");
        homeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 3, true));

        aboutBtn.setBackground(new java.awt.Color(0, 0, 0));
        aboutBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        aboutBtn.setForeground(new java.awt.Color(255, 153, 0));
        aboutBtn.setText("About Us");
        aboutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 3, true));
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });

        contactBtn.setBackground(new java.awt.Color(0, 0, 0));
        contactBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        contactBtn.setForeground(new java.awt.Color(255, 153, 0));
        contactBtn.setText("Contact Us");
        contactBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        profileBtn.setBackground(new java.awt.Color(0, 0, 0));
        profileBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        profileBtn.setForeground(new java.awt.Color(255, 153, 0));
        profileBtn.setText("My Profile");
        profileBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 3, true));
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(0, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 153, 0));
        logoutBtn.setText("Log Out");
        logoutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(contactBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Appointment_img.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void genderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTextActionPerformed

    private void locationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTextActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButton2ActionPerformed
        String name = nameText.getText();
        String age = ageText.getText();
        String phone = phoneText.getText();
        String special = null;
        Object selectedItem = SpecialText.getSelectedItem();
        if (selectedItem != null) {
            special = selectedItem.toString();
            
        }
        DateFormat fmt = new SimpleDateFormat("dd/MM/YY");
        String appoint = fmt.format(this.appointText.getDate());
        String gender = genderText.getText();
        String location = locationText.getText();

        
        
        
        // JOptionPane.showMessageDialog(null, appoint);
        
        if(name.equals("")||age.equals("")||gender.equals("")||location.equals("")||appoint.equals("")||phone.equals("")||special.equals("Specialist")){
          JOptionPane.showMessageDialog(null, "Please Fill all the details");
        
    }else{
        // try {
            String fName="";
            String lName="";
            String temp = "";
            char[] ary = name.toCharArray();

            for(int i=0;i<ary.length;i++){
                if(ary[i]==' '){
                    temp+="1";
                }
                if(temp==""){
                    fName+=ary[i];
                }else{
                    lName+=ary[i];
                }
            }
            // conn=db.connectmysqldb();
            String email = null;
            User u1 = new User(null,null,null,null,null,null,null,null, null, null);
            UserController usc = new UserController();
            ResultSet email_result = usc.selectEmail();
            while(email_result.next()){
                email = email_result.getString(1);
            }

            int age_int   = Integer.parseInt(age);
            Appointment s1 = new Appointment(0,11, email,fName,lName, age_int,location,appoint,gender,special);
            AppointmentController sc= new AppointmentController();
            int result = sc.changeStatus(s1);
            int isInserted = sc.insertAppointment(s1);
            if(isInserted>0){
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
                // System.out.println("Inserted");
                nameText.setText("");
                ageText.setText("");
                phoneText.setText("");
                genderText.setText("");
                locationText.setText("");
                SpecialText.setSelectedItem("Specialist");
                appointText.setCalendar(null);
            }else{
                System.out.println(" NOt Inserted");

            }
            
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     JOptionPane.showMessageDialog(null,e);
        //     System.out.println(e);
        // }
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        dispose();
        new viewAdminProfile().setVisible(true);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    public void UpdateCombo(){
        String[] ary = {"Orthopedist","Neurologist","opthalmologist"};
        // String item = null;
        for(int i = 0;i < ary.length;i++){
            SpecialText.addItem(ary[i]);
        }
        // Spec.ialText.addItem(ary);
    }

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
            java.util.logging.Logger.getLogger(addApointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addApointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addApointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addApointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addApointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SpecialText;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JTextField ageText;
    private com.toedter.calendar.JDateChooser appointText;
    private javax.swing.JButton contactBtn;
    private javax.swing.JTextField genderText;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField locationText;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton profileBtn;
    // End of variables declaration//GEN-END:variables
}
