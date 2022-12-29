/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import controller.*;
import models.Bed;

/**
 *
 * @author razee
 */
public class UpdateBed extends javax.swing.JFrame {

    /**
     * Creates new form UpdateBed
     */
    public UpdateBed() {
        initComponents();
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BedSize = new javax.swing.ButtonGroup();
        BedType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        wrdText = new javax.swing.JTextField();
        wardTypeCombo = new javax.swing.JComboBox<>();
        multipleBtn = new javax.swing.JRadioButton();
        singleBtn = new javax.swing.JRadioButton();
        manualBtn = new javax.swing.JRadioButton();
        electricBtn = new javax.swing.JRadioButton();
        semiElectricBtn = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        contactBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update Bed");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 5, true));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 390, -1));

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BED NO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WARD NO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("WARD TYPE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BED SIZE:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BED TYPE:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, 40));

        idText.setBackground(new java.awt.Color(0, 0, 0));
        idText.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        idText.setForeground(new java.awt.Color(0, 255, 255));
        jPanel1.add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 350, 50));

        wrdText.setBackground(new java.awt.Color(0, 0, 0));
        wrdText.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        wrdText.setForeground(new java.awt.Color(0, 255, 255));
        jPanel1.add(wrdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 320, 50));

        wardTypeCombo.setBackground(new java.awt.Color(0, 0, 0));
        wardTypeCombo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        wardTypeCombo.setForeground(new java.awt.Color(153, 0, 0));
        wardTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "EMERGENCY", "SEMI SPECIAL", "ICU", "CCU", "SPECIAL", "DELUXE", "SUPER DELUXE", "BURNWARD", "NICU", "PICU", " ", " ", " " }));
        jPanel1.add(wardTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 160, 40));

        BedSize.add(multipleBtn);
        multipleBtn.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        multipleBtn.setText("MULTIPLE");
        jPanel1.add(multipleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 190, 40));

        BedSize.add(singleBtn);
        singleBtn.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        singleBtn.setText("SINGLE");
        jPanel1.add(singleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 150, 40));

        BedType.add(manualBtn);
        manualBtn.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        manualBtn.setText("MANUAL");
        jPanel1.add(manualBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 447, 210, 40));

        BedType.add(electricBtn);
        electricBtn.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        electricBtn.setText("ELECTRIC");
        jPanel1.add(electricBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 210, 40));

        BedType.add(semiElectricBtn);
        semiElectricBtn.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        semiElectricBtn.setText("SEMI-ELECTRIC");
        jPanel1.add(semiElectricBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 210, 30));

        updateBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(0, 255, 255));
        updateBtn.setText("UPDATE");
        updateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 4, true));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 260, 60));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/iccon.png"))); // NOI18N

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
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

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
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 0, 130, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Update Bed.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            String wardType = null;
            String bedSize=null;
            String bedType = null;

            Object item = wardTypeCombo.getSelectedItem();
            if(item!=null){
                wardType = item.toString();
            }
            if(singleBtn.isSelected()){
                bedSize= "single";
            }else if(multipleBtn.isSelected()){
                bedSize="multiple";
            }

            if(manualBtn.isSelected()){
                bedType = "manual";
            }else if(semiElectricBtn.isSelected()){
                bedType = "semi-electric";

            }else if(electricBtn.isSelected()){
                bedType ="electric";


            }

            if(wardType.equals(null) || bedSize.equals(null)|| bedType.equals(null)){
                JOptionPane.showMessageDialog(this, "Please fill all the fields");
            }else{
                Bed b1 = new Bed(0,0,bedType,bedSize,wardType);
                BedController bc= new BedController();
                int result= bc.updateBed(b1);
                if(result>0){
                    JOptionPane.showMessageDialog(this,"Updated Success");
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }//GEN-LAST:event_updateBtnActionPerformed

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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        new viewBed().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed
    public void display(){
        try {
            ResultSet rs = new BedController().fetchBed();
            while(rs.next()){
                String id = rs.getString(1);
                String wardNo = rs.getString(2);
                String wardType = rs.getString(3);
                String size  = rs.getString(5);
                String type = rs.getString(4);

                idText.setText(id);
                wrdText.setText(wardNo);
                wardTypeCombo.setSelectedItem(wardType);
                if(size.equals("single")){
                    singleBtn.setSelected(true);
                }else if(size.equals("multiple")){ 
                    multipleBtn.setSelected(true);
                }

                if(type.equals("manual")){
                    manualBtn.setSelected(true);
                }
                else if(type.equals("electric")){
                    electricBtn.setSelected(true);
                }else if(type.equals("semi-electric")){
                    semiElectricBtn.setSelected(true);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
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
            java.util.logging.Logger.getLogger(UpdateBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BedSize;
    private javax.swing.ButtonGroup BedType;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton contactBtn;
    private javax.swing.JRadioButton electricBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JRadioButton manualBtn;
    private javax.swing.JRadioButton multipleBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JRadioButton semiElectricBtn;
    private javax.swing.JRadioButton singleBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JComboBox<String> wardTypeCombo;
    private javax.swing.JTextField wrdText;
    // End of variables declaration//GEN-END:variables
}
