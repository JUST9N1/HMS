package controller;

import java.sql.ResultSet;

import javax.swing.JRadioButtonMenuItem;

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
    
    public ResultSet selectUser(User user){
        String selectQuery = "select * from user_login where user_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
    public ResultSet selectEmail(User user){
        String selectQuery = "select user_email from user_login where user_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int insertdetails(User user){
        String username = user.getUserName();
        String email = user.getUserEmail();
        String pass = user.getUserPass();
        String dob = user.getUserDob();
        String gender=user.getUserGender();
        String sq=user.getUserSq1();

        String insertQuery = "insert into user_login(user_userName,user_email,user_pass,user_dob,gender,user_sq1)" +
         "values('"+username+"','"+email+"','"+pass+"','"+dob+"','"+gender+"','"+sq+"')";
         dbConnection = new DbConnection();
         int result  =dbConnection.manipulate(insertQuery);
         return result;


        
    }
}
