package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.User_Med;

public class UserMedController {
    DbConnection dbConnection;

    public ResultSet selectMedicine(){
        String query = "select medicine.med_name,medicine.med_rate,medicine.med_quantity from user_med join medicine on user_med.med_id = medicine.med_id join user_login on user_login.user_email=user_login.user_email where user_login.user_status="+1+" and user_med.pay='"+"unpiad"+"'";
        dbConnection =new DbConnection();
        ResultSet rs = dbConnection.retrieve(query);
        return rs;
    }

    public int prescribeMedicine(User_Med user_Med){
        int med_id = user_Med.getMed_id();
        String email = user_Med.getUser_email();
        String time = user_Med.getTime();
        String date=  user_Med.getDate();

        String query = "insert into user_med(med_id,user_email,time,date) "+ "values('"+med_id+"','"+email+"','"+time+"','"+date+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public int payAdvance(User_Med user_Med){
        String updateQuery = "update user_med  set pay='paid" + "paid" + "' where user_email='"
                + user_Med.getUser_email() + "'  ";
                dbConnection = new DbConnection();
                int result= dbConnection.manipulate(updateQuery);
                return result;
    }

    public ResultSet selectPrescription(){
        String query = "select * from user_med join user_login on user_med.user_email=user_login.user_email where user_login.user_status=true ";
        dbConnection = new DbConnection();
        ResultSet rs = dbConnection.retrieve(query);
        return rs;
    }
}
