package view;

import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthStyle;

import controller.AppointmentController;
import controller.BedController;
import controller.PatientController;
import controller.UserController;
import models.Appointment;
import models.Bed;
import models.Patient;
import models.User;

public class test {
    public static void main(String[] args) {
        

        try {

            // Reset Password
            // User u1 = new User(null, null, null, "khadkacrystal@gmail.com", null, "khadka", null, "jerry", null, null);
            // UserController uc = new UserController();
            // int result = uc.reset(u1);
            // if(result>0){
            //     JOptionPane.showMessageDialog(null, "Reset password Success");
            // }

            Appointment a1 = new Appointment(0, 0, null, null, null, 0, null, null, null, null);
            AppointmentController ac = new AppointmentController();
            ResultSet result = ac.selectdetails(a1);
            while(result.next()){
                String appointId = result.getString(1);
                String appointName = result.getString(3);
                String appointDate = result.getString(2);
                String doctorId = null;
                String doctorName = null;
                String Special = result.getString(6);
                if (!result.getString(4).equals("4")){
                    
                    doctorId = result.getString(4);
                    doctorName = result.getString(5);
                }
                

                JOptionPane.showMessageDialog(null, appointId+" " + appointName + " " + appointDate + " " + doctorId + " " + doctorName + " " + Special);
            }

        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "e");

        }
    }
}
