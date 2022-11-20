package view;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.AppointmentController;
import controller.DoctorController;
import controller.UserController;
import models.Appointment;
import models.Doctor;
import models.User;
public class view {


    public static void main(String[] args) {
        try {
            Doctor d1 = new Doctor("1", "1", "1", "1", "1");
            DoctorController sc = new DoctorController();
            int result = sc.insertdetails(d1);
            if(result>0){
                JOptionPane.showMessageDialog(null, "Inserted Success");
            }else{
                JOptionPane.showMessageDialog(null, "Inserted inSuccess");
                
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
        

    }
}


