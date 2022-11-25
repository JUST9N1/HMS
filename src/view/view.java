package view;

// package view;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

// import com.mysql.cj.xdevapi.Result;

import controller.AppointmentController;
import controller.DoctorController;
import controller.UserController;
import models.Appointment;
import models.Doctor;
import models.User;
public class view {


    public static void main(String[] args) {
        try {
            Appointment a1 = new Appointment(0, 0, null, null, null, 0, null, null, null, null);
            AppointmentController sc = new AppointmentController();
            ResultSet result = sc.getDetails(a1);
            ResultSet newResult = sc.getSpecialist(a1);
            String c = null;
            while(newResult.next()){

                c = newResult.getString(1);
                System.out.println(c);
            }
            String a = null;
            String b = null;
            while(result.next()){
                a= result.getString(1);
                b= result.getString(2);

                System.out.println(a);
                System.out.println(b);

            }
            Doctor d1 = new Doctor(0, null,null,null,null,c);
            DoctorController dc = new DoctorController();
            ResultSet rSet = dc.viewDoctorid(d1);
         String dId  = null;
            while(rSet.next()){
                dId = rSet.getString(1);
                System.out.println(dId);
                
            }
            d1 = new Doctor(Integer.parseInt(dId),null,null,null,null,null);
            ResultSet value = dc.viewDoctorName(d1);
            String name= null;
            while (value.next()){
                name = value.getString(1) + " " + value.getString(2);
                System.out.println(name);
            }

            a1 = new Appointment(0,Integer.parseInt(dId),null,null,null,0, null,null,null,null);
            int assign = sc.insertDID(a1);
            if(assign>0){
                JOptionPane.showMessageDialog(null, "Inserted Successfully");

            }
            // JOptionPane.showMessageDialog(null, string);

                
            
            
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
        

    }
}


