/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

// import AbsoluteLayout;

import controller.DoctorController;
import models.Doctor;

/**
 *
 * @author khadk
 */
public class addDoctorView extends javax.swing.JFrame {

    /**
     * Creates new form addDoctorView
     */
    public addDoctorView() {
        initComponents();
        table();
        UpdateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        firstText = new javax.swing.JTextField();
        LastText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        DepartText = new javax.swing.JTextField();
        SpecialText = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.gray);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image 4 (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jButton4.setText("Home");

        jButton5.setText("About us");

        jButton6.setText("Contact");

        jButton7.setText("My Profile");

        jButton8.setText("Log Out");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 610));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Doctor details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 210, -1));

        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "D ID", "Doctor name", "Age", "Department", "Speciality"
            }
        ));
        doctorTable.setGridColor(java.awt.Color.white);
        doctorTable.setShowHorizontalLines(true);
        doctorTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(doctorTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, 300));

        addBtn.setBackground(new java.awt.Color(204, 204, 204));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBtn.setText("Add doctor");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 210, 70));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("View Doctor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 160, 70));

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteBtn.setText("Delete Doctor");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 160, 70));

        firstText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstText.setText("Doctor First name");
        firstText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstTextFocusLost(evt);
            }
        });
        firstText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstTextActionPerformed(evt);
            }
        });
        jPanel1.add(firstText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 220, 50));

        LastText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LastText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LastText.setText("Doctor last name");
        LastText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LastTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LastTextFocusLost(evt);
            }
        });
        jPanel1.add(LastText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 220, 50));

        AgeText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AgeText.setText("Doctor Age");
        AgeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AgeTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AgeTextFocusLost(evt);
            }
        });
        jPanel1.add(AgeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 220, 50));

        DepartText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DepartText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DepartText.setText("Department");
        DepartText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DepartTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DepartTextFocusLost(evt);
            }
        });
        jPanel1.add(DepartText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 220, 50));

        SpecialText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Specialist" }));
        SpecialText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SpecialTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SpecialTextFocusLost(evt);
            }
        });
        jPanel1.add(SpecialText, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 350, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/doctor.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1027, 610));

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

    protected void deleteBtnActionPerformed(ActionEvent evt) {
        int i = doctorTable.getSelectedRow();
    

            TableModel model = doctorTable.getModel();
            
            int id = Integer.parseInt(model.getValueAt(i, 0).toString());
            Doctor d1 = new Doctor(id,null,null,null,null,null);
            DoctorController dc = new DoctorController();
            int result = dc.deleteDoctor(d1);
            if(result>0){
                JOptionPane.showMessageDialog(this, "Deleted Success");
                
                table();
            }
    }

    private void SpecialTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SpecialTextFocusGained
        // TODO add your handling code here:
        SpecialText.removeItem("Specialist");
    }//GEN-LAST:event_SpecialTextFocusGained

    private void SpecialTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SpecialTextFocusLost
        // TODO add your handling code here:
        SpecialText.addItem("Specialist");
    }//GEN-LAST:event_SpecialTextFocusLost

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String fname = firstText.getText();
        String lname = LastText.getText();
        String age = AgeText.getText();
        String department = DepartText.getText();
        String special = null;
        Object selectedItem = SpecialText.getSelectedItem();
        if (selectedItem != null) {
            special = selectedItem.toString();
            
        }

        try {
            Doctor d1 = new Doctor(0, fname, lname, age, department, special);
            DoctorController sc = new DoctorController();
            int result = sc.insertdetails(d1);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Inserted Success");
                try {
                    d1 = new Doctor(0, null, null, null, null, null);
                    sc = new DoctorController();
                    ResultSet test = sc.selectdetails(d1);
                    DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
                    model.setRowCount(0);
                    while (test.next()) {
                        int id = Integer.parseInt(test.getString(1));
                        String name = test.getString(2) + " " + test.getString(3);
                        age = test.getString(4);
                        String depart = test.getString(5);
                        special = test.getString(6);
                        if(depart.equals("0")){
                            continue;
                        }
                        Object[] row = { id, name, age, depart, special };
                        model.addRow(row);
                        

                    }
                    firstText.setText("Doctor First name");
                    LastText.setText("Doctor last name");
                    // SpecialText.
                    SpecialText.addItem("Specialist");
                    SpecialText.setSelectedItem("Specialist");
                    AgeText.setText("Doctor Age");
                    DepartText.setText("Department");

                } catch (Exception e) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Inserted inSuccess");

            }

        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }// GEN-LAST:event_addBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i = doctorTable.getSelectedRow();
        // if (i>0){

            TableModel model = doctorTable.getModel();
            
            int id = Integer.parseInt(model.getValueAt(i, 0).toString());
            try {
                Doctor d1 = new Doctor(id, null, null, null, null, null);
    
                DoctorController sc = new DoctorController();
                int out = sc.updatestatus(d1);
                int result = sc.changestatus(d1);
                dispose();
                ViewDoctor vd = new ViewDoctor();
                vd.setVisible(true);
    
            } catch (Exception e) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, e);
            // }
        // }else{
            // JOptionPane.showMessageDialog(null, "Select only one row");




        }

    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed

    }// GEN-LAST:event_jButton3ActionPerformed

    private void firstTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstTextActionPerformed
        // TODO add your handling code here:
        if (firstText.getText().equals("Doctor First name")) {
            firstText.setText("");
        }
    }// GEN-LAST:event_firstTextActionPerformed

    private void firstTextFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_firstTextFocusGained
        // TODO add your handling code here:s
        if (firstText.getText().equals("Doctor First name")) {
            firstText.setText("");
        }

    }// GEN-LAST:event_firstTextFocusGained

    private void LastTextFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_LastTextFocusGained
        // TODO add your handling code here:
        if (LastText.getText().equals("Doctor last name")) {
            LastText.setText("");
        }
    }// GEN-LAST:event_LastTextFocusGained

    private void AgeTextFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_AgeTextFocusGained
        if (AgeText.getText().equals("Doctor Age")) {
            AgeText.setText("");
        }
    }// GEN-LAST:event_AgeTextFocusGained

    private void DepartTextFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_DepartTextFocusGained
        if (DepartText.getText().equals("Department")) {
            DepartText.setText("");
        }
    }// GEN-LAST:event_DepartTextFocusGained

    

    private void firstTextFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_firstTextFocusLost
        if (firstText.getText().equals("")) {
            firstText.setText("Doctor First name");
        }
    }// GEN-LAST:event_firstTextFocusLost

    private void LastTextFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_LastTextFocusLost
        if (LastText.getText().equals("")) {
            LastText.setText("Doctor last name");

        }
    }// GEN-LAST:event_LastTextFocusLost

    private void AgeTextFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_AgeTextFocusLost
        // TODO add your handling code here:
        if (AgeText.getText().equals("")) {
            AgeText.setText("Doctor Age");
        }
    }// GEN-LAST:event_AgeTextFocusLost

    private void DepartTextFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_DepartTextFocusLost
        // TODO add your handling code here:
        if (DepartText.getText().equals("")) {
            DepartText.setText("Department");
        }
    }// GEN-LAST:event_DepartTextFocusLost

    public void table(){
        try {
            Doctor d1 = new Doctor(0, null, null, null, null, null);
            DoctorController sc = new DoctorController();
            ResultSet result = sc.selectdetails(d1);
            DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
                    model.setRowCount(0);
            while (result.next()) {
                int id = Integer.parseInt(result.getString(1));
                String name = result.getString(2) + " " + result.getString(3);
                String age = result.getString(4);
                String depart = result.getString(5);
                String special = result.getString(6);
                Object[] row = { id, name, age, depart, special };
                
                if(depart.equals("0")){
                    continue;
                }
                // DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
                model.addRow(row);
            }

        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(addDoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDoctorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeText;
    private javax.swing.JTextField DepartText;
    private javax.swing.JTextField LastText;
    private javax.swing.JComboBox<String> SpecialText;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable doctorTable;
    private javax.swing.JTextField firstText;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
