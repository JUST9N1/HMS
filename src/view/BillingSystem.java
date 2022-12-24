/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import controller.AppointmentController;
import controller.BillController;
import controller.UserController;
import controller.UserMedController;
import models.Appointment;
import models.Bill;
import models.User_Med;
/**
 *
 * @author razee
 */
public class BillingSystem extends javax.swing.JFrame {

    private String total_display;
    private int med_total;
    private int test_total;
    /**
     * Creates new form BillingSystem
     */
    public BillingSystem() {
        initComponents();
        
        func();
        fetch();
        // func2();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TestDetails = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        MedicineDetails = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        billText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        patientText = new javax.swing.JTextField();
        totalBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        payBtn = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Billing System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 40));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel3.setText("bill no:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel4.setText("Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel5.setText("Patient's Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        TestDetails.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        TestDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TEST NAME", "QUANTITY", "AMOUNT"
            }
        ));
        jScrollPane1.setViewportView(TestDetails);

        MedicineDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MEDICINE NAME", "Quantity", "Amount"
            }
        ));
        jScrollPane2.setViewportView(MedicineDetails);

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TEST DETAILS");

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MEDICINE DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 710, 460));

        billText.setBackground(new java.awt.Color(0, 0, 0));
        billText.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        billText.setForeground(new java.awt.Color(255, 255, 255));
        billText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billTextActionPerformed(evt);
            }
        });
        jPanel1.add(billText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 200, 35));

        dateText.setBackground(new java.awt.Color(0, 0, 0));
        dateText.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });
        jPanel1.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, 35));

        patientText.setBackground(new java.awt.Color(0, 0, 0));
        patientText.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        patientText.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(patientText, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 280, 35));

        totalBtn.setBackground(new java.awt.Color(0, 0, 0));
        totalBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        totalBtn.setForeground(new java.awt.Color(0, 255, 255));
        totalBtn.setText("SHOW  TOTAL AMOUNT");
        totalBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 4, true));
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(totalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 280, 50));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.setText("PAYMENT STATEMENT");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 4, true));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 260, 50));

        payBtn.setBackground(new java.awt.Color(0, 0, 0));
        payBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        payBtn.setForeground(new java.awt.Color(0, 255, 255));
        payBtn.setText("PROCEED TO PAY");
        payBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 4, true));
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });
        jPanel1.add(payBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 260, 50));

        totalLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(0, 255, 255));
        totalLabel.setText("Rs. 0");
        jPanel1.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 140, 30));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Billing System.png"))); // NOI18N
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

    private void billTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billTextActionPerformed

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextActionPerformed

    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed
        JOptionPane.showMessageDialog(this, "Total Amount :"+total_display);
        totalLabel.setText("Rs. "+total_display+"");
    }//GEN-LAST:event_totalBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
       Bill b1 = new Bill(Integer.parseInt(billText.getText()), null,null, (med_total+test_total), med_total, test_total);
       BillController bc=  new BillController();
       String email = null;
       int result  = bc.payment(b1);
       if(result>0){
        JOptionPane.showMessageDialog(this, "Payment Success");
        UserController usc = new UserController();
            ResultSet email_result = usc.selectEmail();
            try {
                while(email_result.next()){
                    email = email_result.getString(1);
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        // Appointment a1 = new Appointment
        Appointment a1 = new Appointment(0,0,email,"","",0,"","","","");
        AppointmentController ac = new AppointmentController();
        ac.payAdvance(a1);
        ac.updateBill(a1); 
        
        new UserMedController().payAdvance(new User_Med(0, email, null,null));
        func();
       }
    }//GEN-LAST:event_payBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed
    public void func(){
        try {
            
            DefaultTableModel model = (DefaultTableModel) TestDetails.getModel();
            model.setRowCount(0);
            int total=0;
            test_total = 0;
            Appointment a1 = new Appointment(0,0,"","","",0,"","","","");
            AppointmentController ac = new AppointmentController();
            ResultSet rs = ac.countAppoint(a1);
            while(rs.next()){
                int count = Integer.parseInt(rs.getString(1));
                Object[] rows= {"Appointment(Advance)",count,700*count};
                total = total+(700*count);
                model.addRow(rows);
                // test_total+=(700*count);

                System.out.println(total);
            }
            
            rs = ac.countAppoint_Doc(a1);
            while(rs.next()){
                int count = Integer.parseInt(rs.getString(1));
                Object[] rows= {"Appointment Fees",count,1400*count};
                model.addRow(rows);
                total = total+(1400*count);
                // System.out.println(total);



            }
            test_total = total;
            med_total=0;
            System.out.println(test_total);
            DefaultTableModel medModel = (DefaultTableModel) MedicineDetails.getModel();
            medModel.setRowCount(0);
            //  total=0;
            UserMedController umc = new UserMedController();
           ResultSet reSet =  umc.selectMedicine();
           while(reSet.next()){
            String name = reSet.getString(1);
            int rate = Integer.parseInt(reSet.getString(2));
            int quantity = Integer.parseInt(reSet.getString(3));
            Object[] rows = {name,quantity,rate*quantity};
            medModel.addRow(rows);
            med_total = total+(rate*quantity);
            total = total+(rate*quantity);
           }
           System.out.println(med_total);
           total_display = Integer.toString(total);
            
            total_display = Integer.toString(total);
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    
            
        }

        public void fetch(){
            try {
                ResultSet rs = new BillController().selectBill();
                while(rs.next()){
                    String id = rs.getString(1);
                    String email = rs.getString(2);
                    String date= rs.getString(3);

                    billText.setText(id);
                    dateText.setText(date);
                    patientText.setText(email);
                    
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
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MedicineDetails;
    private javax.swing.JTable TestDetails;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField billText;
    private javax.swing.JTextField dateText;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField patientText;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton totalBtn;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
