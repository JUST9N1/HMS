package controller;




import java.sql.ResultSet;

import javax.swing.JRadioButtonMenuItem;

import database.DbConnection;
import models.Admin;
// import models.admin;

public class AdminController {
    DbConnection dbConnection;

    public ResultSet selectLogin(Admin admin) {
        String email = admin.getadminEmail();
        String pass = admin.getadminPass();
        String selectQuery = "select * from admin_login where admin_email='" + email + "' and admin_pass ='" + pass + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int UpdateStatus(Admin admin){
        String status = admin.getadminStatus();
        String updatestatus = "update admin_login set admin_status=false where admin_status=true";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updatestatus);
        // int result1 = dbConnection.manipulate(updateQuery);
        // return result1 ;
        return  result;
        
    }
    
    public int changestatus(Admin admin){
        String email = admin.getadminEmail();
        String updateQuery = "update admin_login set admin_status=true where admin_email = '"+email+"'";
        dbConnection = new DbConnection();
        int result1 = dbConnection.manipulate(updateQuery);
        return result1 ;
    }
    
    public ResultSet selectadmin(Admin admin){
        String selectQuery = "select * from admin_login where admin_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int insertdetails(Admin admin){
        String adminname = admin.getadminName();
        String email = admin.getadminEmail();
        String pass = admin.getadminPass();
        String dob = admin.getadminDob();
        String gender=admin.getadminGender();
        String sq=admin.getadminSq1();

        String insertQuery = "insert into admin_login(admin_userName,admin_email,admin_pass,admin_dob,gender,admin_sq1)" +
         "values('"+adminname+"','"+email+"','"+pass+"','"+dob+"','"+gender+"','"+sq+"')";
         dbConnection = new DbConnection();
         int result  =dbConnection.manipulate(insertQuery);
         return result;


        
    }
}


