/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.PatientController;
import controller.UserController;
import models.Patient;

/**
 *
 * @author mfc
 */
public class ViewPatientRecord extends javax.swing.JFrame {

    /**
     * Creates new form ViewPatientRecord
     */
    public ViewPatientRecord() {
        initComponents();
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
//adding text field
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        assginBtn = new javax.swing.JButton();
        prescribeMed = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        contactBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(java.awt.Color.black);
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("BACK");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 150, 60));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Patient Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 90));

        patientTable.setBackground(new java.awt.Color(204, 204, 204));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Age", "Gender", "Blood Group", "Contact Number"
            }
        ));
        patientTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(patientTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 660, 490));

        updateBtn.setBackground(java.awt.Color.black);
        updateBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        updateBtn.setForeground(java.awt.Color.white);
        updateBtn.setText("Update Patients");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 390, 180, 70));

        assginBtn.setBackground(java.awt.Color.black);
        assginBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        assginBtn.setForeground(java.awt.Color.white);
        assginBtn.setText("Assign Bed");
        assginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(assginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 180, 70));

        prescribeMed.setBackground(java.awt.Color.black);
        prescribeMed.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        prescribeMed.setForeground(java.awt.Color.white);
        prescribeMed.setText("Prescribe Medcine");
        prescribeMed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prescribeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeMedActionPerformed(evt);
            }
        });
        jPanel1.add(prescribeMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 180, 70));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/View Patient Records.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
// Updating table
    private void assginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assginBtnActionPerformed
        int i = patientTable.getSelectedRow();
        TableModel model = patientTable.getModel();
        int id = Integer.parseInt(model.getValueAt(i, 0).toString());
        Patient p1 = new Patient(id, 0, 0, null, null, null, 0,0);
            PatientController pc = new PatientController();
            pc.resetStatus(p1);
            pc.updatestatus(p1);
            dispose();
            new AssignBed().setVisible(true);
    }//GEN-LAST:event_assginBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int i = patientTable.getSelectedRow();
        TableModel model = patientTable.getModel();
        int id = Integer.parseInt(model.getValueAt(i, 0).toString());
        Patient p1 = new Patient(id, 0, 0, null, null, null, 0,0);
            PatientController pc = new PatientController();
            pc.resetStatus(p1);
            pc.updatestatus(p1);
            dispose();
            new EditPatientDetails().setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void prescribeMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeMedActionPerformed
        int i = patientTable.getSelectedRow();
        TableModel model = patientTable.getModel();
        int id = Integer.parseInt(model.getValueAt(i, 0).toString());
        Patient p1 = new Patient(id, 0, 0, null, null, null, 0,0);
            PatientController pc = new PatientController();
            pc.resetStatus(p1);
            pc.updatestatus(p1);
            dispose();
            new MedicinePrescription().setVisible(true);
    }//GEN-LAST:event_prescribeMedActionPerformed

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
public void table(){
    try {
        DefaultTableModel moddel  = (DefaultTableModel) patientTable.getModel();
        moddel.setRowCount(0);
        moddel.isCellEditable(0,0);
        Patient p1 = new Patient(0, 0, 0, null, null, null,0, 0);
        PatientController pc = new PatientController();
        ResultSet rSet = pc.selectDetails();
        while(rSet.next()){
            String id = rSet.getString(1);
            String name = rSet.getString(2);
            String age = rSet.getString(3);
            String gender = rSet.getString(4);
            String bloodgroup = rSet.getString(5);
            String contact = rSet.getString(6);
            Object[] rows = {id,name,age,gender,bloodgroup,contact};
            moddel.addRow(rows);

            
        }
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
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
            java.util.logging.Logger.getLogger(ViewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//create table 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPatientRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton assginBtn;
    private javax.swing.JButton contactBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton prescribeMed;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
