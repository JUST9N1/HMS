/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.PatientController;
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
        jButton3 = new javax.swing.JButton();
        assginBtn = new javax.swing.JButton();
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
        // patientTable.setColumnSelectionAllowed(true);
        patientTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(patientTable);
        patientTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 780, 490));

        jButton3.setBackground(java.awt.Color.black);
        jButton3.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        jButton3.setForeground(java.awt.Color.white);
        jButton3.setText("Update Patients");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 190, 80));

        assginBtn.setBackground(java.awt.Color.black);
        assginBtn.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        assginBtn.setForeground(java.awt.Color.white);
        assginBtn.setText("Assign Bed");
        assginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(assginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 190, 80));

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
public void table(){
    try {
        DefaultTableModel moddel  = (DefaultTableModel) patientTable.getModel();
        moddel.setRowCount(0);
        moddel.isCellEditable(0,0);
        Patient p1 = new Patient(0, 0, 0, null, null, null,0, 0);
        PatientController pc = new PatientController();
        ResultSet rSet = pc.selectDetails(p1);
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
    private javax.swing.JButton assginBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    // End of variables declaration//GEN-END:variables
}
