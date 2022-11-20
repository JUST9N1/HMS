package view;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.Result;

import controller.AppointmentController;
import controller.DoctorController;
import controller.UserController;
import models.Appointment;
import models.Doctor;
import models.User;
public class view {


    public static void main(String[] args) {
        try {
            Doctor d1 = new Doctor(1,null, null, null, null, null);
            
            DoctorController sc= new DoctorController();
            int out = sc.updatestatus(d1);
            int result = sc.changestatus(d1);
            ResultSet view = sc.viewdetails(d1);
            String string = null;
            while(view.next()){
                String fname = view.getString(2) ;
                String lname =view.getString(3) ;
                String age = view.getString(4);
                String depart =view.getString(5) ;
                String special =view.getString(6) ;

                string = fname + " " + lname + " " + age + " " + depart + " "+ special; 
            }

            
            JOptionPane.showMessageDialog(null, string);

                
            
            
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
        

    }
}


