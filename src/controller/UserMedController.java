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
}
