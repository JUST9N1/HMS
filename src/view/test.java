package view;

import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthStyle;

import controller.BedController;
import controller.UserController;
import models.Bed;
import models.User;

public class test {
    public static void main(String[] args) {
        try {
        //     
            User u1 = new User("Crystal", "Khadka", "Crystal", "khadka@gmail.com", "9843041037", "1234", "24/05/2004", null, null, null);
            UserController uc = new UserController();
            int result = uc.updatedetails(u1);
            if(result>0){
                JOptionPane.showMessageDialog(null, "Updated Success");
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        
        }
        
        
        // try {
        //     Bed b1 = new Bed(0, 0, null, null, null);
        //     BedController bc = new BedController();
        //     ResultSet rSet = bc.viewDetails(b1);
        //     if(rSet.next()){
        //         int bed_no = Integer.parseInt(rSet.getString(1));
        //         int ward_no = Integer.parseInt(rSet.getString(4));
        //         String bed_Type = rSet.getString(2);
        //         String bed_size = rSet.getString(3);
        //         String ward_type = rSet.getString(5);
        //         System.out.println(bed_no + ward_no + bed_Type +bed_size +ward_type);
        //     }
        // } catch (Exception e) {
        //         JOptionPane.showMessageDialog(null, "e");
            
        // }
    }
}
