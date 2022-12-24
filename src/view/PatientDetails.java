/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import controller.PatientController;
import controller.UserController;
import models.Patient;

/**
 *
 * @author razee
 */
public class PatientDetails extends javax.swing.JFrame {

    /**
     * Creates new form PatientDetails
     */
    public PatientDetails() {
        initComponents();
        view()  ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        othersRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        medicalText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        bloodCombo = new javax.swing.JComboBox<>();
        maleRadio = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        addressText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailCombo = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        contactBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Gender.add(othersRadio);
        othersRadio.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        othersRadio.setForeground(new java.awt.Color(255, 255, 0));
        othersRadio.setText("Others");
        othersRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersRadioActionPerformed(evt);
            }
        });
        jPanel2.add(othersRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 80, -1));

        Gender.add(femaleRadio);
        femaleRadio.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        femaleRadio.setForeground(new java.awt.Color(255, 255, 0));
        femaleRadio.setText("Female");
        jPanel2.add(femaleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 80, -1));

        medicalText.setBackground(new java.awt.Color(0, 255, 255));
        medicalText.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        medicalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalTextActionPerformed(evt);
            }
        });
        jPanel2.add(medicalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 410, 80));

        nameText.setBackground(new java.awt.Color(51, 255, 255));
        nameText.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        jPanel2.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 245, 37));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 107, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Medical history:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 195, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E-mail:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        createBtn.setBackground(new java.awt.Color(0, 0, 0));
        createBtn.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 0));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        jPanel2.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 170, 50));

        bloodCombo.setBackground(new java.awt.Color(0, 0, 0));
        bloodCombo.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        bloodCombo.setForeground(new java.awt.Color(255, 255, 51));
        bloodCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A-", "A+", "B-", "B+", "O-", "O+", "AB-", "AB+", " " }));
        jPanel2.add(bloodCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 80, 40));

        Gender.add(maleRadio);
        maleRadio.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        maleRadio.setForeground(new java.awt.Color(255, 255, 51));
        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });
        jPanel2.add(maleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 80, -1));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel2.setText("Patient Details");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 490, 59));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Group:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, 24));

        ageText.setBackground(new java.awt.Color(0, 255, 255));
        ageText.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jPanel2.add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 230, 32));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        viewBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewBtn.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        viewBtn.setForeground(new java.awt.Color(255, 0, 51));
        viewBtn.setText("View Details");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 180, 50));

        addressText.setBackground(new java.awt.Color(0, 255, 255));
        addressText.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jPanel2.add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 265, 36));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 110, -1));

        emailCombo.setBackground(new java.awt.Color(102, 255, 255));
        emailCombo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jPanel2.add(emailCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 270, 40));

        backBtn.setBackground(new java.awt.Color(51, 255, 255));
        backBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back button.png"))); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 5));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 0, 130, 50));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/iccon.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("HMS");

        homeBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 153, 0));
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/home button.png"))); // NOI18N
        homeBtn.setText("HOME");
        homeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 3, true));
        homeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        aboutBtn.setBackground(new java.awt.Color(0, 0, 0));
        aboutBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        aboutBtn.setForeground(new java.awt.Color(255, 153, 0));
        aboutBtn.setText("About Us");
        aboutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 3, true));
        aboutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });

        contactBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        contactBtn.setForeground(new java.awt.Color(255, 153, 0));
        contactBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Report Button.png"))); // NOI18N
        contactBtn.setText("Report");
        contactBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        contactBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        contactBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactBtnActionPerformed(evt);
            }
        });

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

        logoutBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 153, 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/log out.png"))); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        logoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(profileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aboutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contactBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Create Patient Details.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        String name = nameText.getText();
        String age = ageText.getText();
        String gender = null;
        String blood = null;
        String address = addressText.getText();
        String email = null;

        if (emailCombo.getSelectedItem() != null) {
            email = emailCombo.getSelectedItem().toString();
        }
        String medical = medicalText.getText();

        if (maleRadio.isSelected()) {
            gender = "Male";
        } else if (femaleRadio.isSelected()) {
            gender = "Female";
        } else {
            gender = "others";
        }
        Object selecteditem = bloodCombo.getSelectedItem();
        if (selecteditem != null) {
            blood = selecteditem.toString();
        }

        if (name.equals("") || age.equals("") || gender.equals(null) || blood.equals(null) || address.equals("")
                || email.equals("") || medical.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter all the details");
                }else{
                    try {
                        Patient p1 = new Patient(0, 0, 0, email, medical, blood,Integer.parseInt(age),0);
                        PatientController pc = new PatientController();
                        int result = pc.insertDetails(p1);
                        if(result>0){

                            JOptionPane.showMessageDialog(null, "Patient details successfully created");
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                        JOptionPane.showMessageDialog(null, e);

            }
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        dispose();
        new ViewPatientRecord().setVisible(true);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        dispose();
        String role ="null";
        try {
            UserController uc = new UserController();
            ResultSet result = uc.selectRole();

            while (result.next()) {
                role = result.getString("role");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        if(role.equals("admin")) {
            new AdminDashboard().setVisible(true);
        }
        else if(role.equals("user")) {
            new UserDashboard().setVisible(true);
        }
        else {
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed

        new AboutUs().setVisible(true);
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void contactBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactBtnActionPerformed
        dispose();
        new ReportProblem().setVisible(true);
    }//GEN-LAST:event_contactBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        dispose();
        new viewProfile().setVisible(true);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed

        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if(result == JOptionPane.YES_OPTION){
            dispose();
            new UserDashboard().logout();
        }else{
            return;
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_maleRadioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton3ActionPerformed

    private void medicalTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_medicalTextActionPerformed
        // TODO add your handling code here:
        
    }// GEN-LAST:event_medicalTextActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nameTextActionPerformed

    private void othersRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_othersRadioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_othersRadioActionPerformed
    public void view(){
        ResultSet rs = new UserController().selectAllEmail();
        ResultSet rs1=  new PatientController().selectPatinetEmail();
        String email = null;
        String item = null;
        String[] emailArray = {};
        ArrayList<String> emailList = new ArrayList<String>();
        try {
            while(rs1.next()){
                // int i= 0 ;
                item = rs1.getString(1);
                emailList.add(item);
                // i++;
            }
            // System.out.println(emailArray);
            System.out.println(Arrays.toString(emailList.toArray()));
            
            while(rs.next()){
               email = rs.getString(1);
                if(!Arrays.asList(emailList.toArray()).contains(email)){
                     emailCombo.addItem(email);
                }
               
            }
        } catch (Exception e) {
    }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField ageText;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> bloodCombo;
    private javax.swing.JButton contactBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JComboBox<String> emailCombo;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField medicalText;
    private javax.swing.JTextField nameText;
    private javax.swing.JRadioButton othersRadio;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
