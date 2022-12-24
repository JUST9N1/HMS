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

    public int UpdateStatus(User user) {
       
        String updatestatus = "update user_login set user_status=false where user_status=true";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updatestatus);
        // int result1 = dbConnection.manipulate(updateQuery);
        // return result1 ;
        return result;

    }

    public int changestatus(User user) {
        String email = user.getUserEmail();
        String updateQuery = "update user_login set user_status=true,role='"+user.getUserRole()+"' where user_email = '" + email + "'";
        dbConnection = new DbConnection();
        int result1 = dbConnection.manipulate(updateQuery);
        return result1;
    }

    public ResultSet selectUser(User user) {
        String selectQuery = "select * from user_login where user_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public ResultSet selectEmail() {
        String selectQuery = "select user_email from user_login where user_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
    public ResultSet selectRole() {
        String selectQuery = "select role from user_login where user_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int insertdetails(User user) {
        String username = user.getUserName();
        String email = user.getUserEmail();
        String pass = user.getUserPass();
        String dob = user.getUserDob();
        String gender = user.getUserGender();
        String sq = user.getUserSq1();
        // String role = user.getUserRole();

        String insertQuery = "insert into user_login(user_userName,user_email,user_pass,user_dob,gender,user_sq1)" +
                "values('" + username + "','" + email + "','" + pass + "','" + dob + "','" + gender + "','" + sq + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;

    }

    public int updatedetails(User user) {
        String fname = user.getUserfName();
        String lname = user.getUserlName();
        String phone = user.getUserContact();
        String username = user.getUserName();
        String email = user.getUserEmail();
        String pass = user.getUserPass();
        String dob = user.getUserDob();
        String gender = user.getUserGender();

        String insertQuery = "update user_login set user_fname='" + fname + "',user_lname='" + lname
                + "',user_contact='" + phone + "',user_userName='" + username + "',user_email='"+email+"',user_pass='"+pass+"',user_dob='"+dob+"',gender='"+gender+"' where user_status=1";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
    public int reset(User user){
        String email = user.getUserEmail();
        String sq = user.getUserSq1();
        String pass = user.getUserPass();

        String updateQuery = "update user_login set user_pass='"+pass+"' where user_email='"+email+"' and user_sq1='"+sq+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public int deleteAppointEmail(User user){

        String deleteQuery = "delete from appointment where user_email='"+user.getUserEmail()+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
    }
    public int deletePatientEmail(User user){

        String deleteQuery = "delete from patient where user_email='"+user.getUserEmail()+"' ";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
    }
    public int deleteMedicineEmail(User user){

        String deleteQuery = "delete from user_med where user_email='"+user.getUserEmail()+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
    }

    public int deleteProfile(User user){
        String deleteQuery = "delete from user_login where user_status=1";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
    }

    public int deleteBillEmail(User user){
        String deleteQuery = "delete from bill where user_email='"+user.getUserEmail()+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
    }

    public int logout(){
        String updateQuery = "update user_login set user_status=false where user_status=true";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet selectAllEmail(){
        String selectQuery = "select user_email from user_login";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    
}   
