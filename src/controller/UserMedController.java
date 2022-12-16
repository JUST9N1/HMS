package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.User_Med;

public class UserMedController {
    DbConnection dbConnection;

    public ResultSet selectMedicine(){
        String query = "select medicine.med_name,medicine.med_rate,medicine.med_quantity from user_med join medicine on user_med.med_id = medicine.med_id join user_login on user_login.user_email=user_login.user_email where user_login.user_status="+1+"";
        dbConnection =new DbConnection();
        ResultSet rs = dbConnection.retrieve(query);
        return rs;
    }

    public int prescribeMedicine(User_Med user_Med){
        int med_id = user_Med.getMed_id();
        String email = user_Med.getUser_email();
        String time = user_Med.getTime();

        String query = "insert into user_med(med_id,user_email,time) "+ "values('"+med_id+"','"+email+"','"+time+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }
}
