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
            User s1 = new User(null, null, null, "2", null, "1", null, null, null);

            UserController sc= new UserController();
            ResultSet isInserted = sc.selectLogin(s1);
            
            if(isInserted.next()){
                JOptionPane.showMessageDialog(null,"Inserted Success");
                sc.UpdateStatus(s1);
                sc.changestatus(s1);
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


