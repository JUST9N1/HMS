package view;

// package view;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

// import com.mysql.cj.xdevapi.Result;

import controller.AppointmentController;
import controller.DoctorController;
import controller.PatientController;
import controller.UserController;
import models.Appointment;
import models.Doctor;
import models.Patient;
import models.User;
public class view {


    public static void main(String[] args) {
        try {
            Patient p1 = new Patient(1, 0, 0, null, null, null, 0,0);
            PatientController pc = new PatientController();
            pc.resetStatus(p1);
            pc.updatestatus(p1);
            
           
                // JOptionPane.showMessageDialog(null, id+" "+name+" "+ age+" "+ gender+" "+bloodgroup+" "+contact );
            
            // JOptionPane.showMessageDialog(null, string);

                
            
            
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
        

    }
}


