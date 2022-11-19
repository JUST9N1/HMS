package view;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.AppointmentController;
import controller.UserController;
import models.Appointment;
import models.User;
public class view {


    public static void main(String[] args) {
        try {
            User s1 = new User(null, null, null, null, null, null, null, null, null, null);
            UserController sc= new UserController();
            ResultSet isInserted = sc.selectUser(s1);
            
            if(isInserted.next()){
                String fname = isInserted.getString(1);
                String lname = isInserted.getString(2);
                String username = isInserted.getString(3);
                String email = isInserted.getString(4);
                String contact = isInserted.getString(5);
                String dob = isInserted.getString(7);
                
                // String fname = isInserted.getString(0);

                System.out.println(fname + lname +username + email + contact +dob);
                
            }
            else{
                System.out.println("Failed to insert student");
                
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}


