package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.User;

public class UserController {
    DbConnection dbConnection;

    public ResultSet selectLogin(User user) {
        String email = user.getUserEmail();
        String pass = user.getUserPass();
        String selectQuery = "select * from user_login where user_email='" + email + "' and user_pass ='" + pass + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int UpdateStatus(User user){
        String status = user.getUserStatus();
        String updatestatus = "update user_login set user_status=false where user_status=true";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updatestatus);
        // int result1 = dbConnection.manipulate(updateQuery);
        // return result1 ;
        return  result;
        
    }
    
    public int changestatus(User user){
        String email = user.getUserEmail();
        String updateQuery = "update user_login set user_status=true where user_email = '"+email+"'";
        dbConnection = new DbConnection();
        int result1 = dbConnection.manipulate(updateQuery);
        return result1 ;
    }
}
