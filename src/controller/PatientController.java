package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Patient;

public class PatientController {
    DbConnection dbConnection;

    public int insertDetails(Patient patient) {
        String email = patient.getUser_email();
        String medical = patient.getPatient_history();
        String blood = patient.getBlood_group();
        int age = patient.getAge();
        String insertQuery = "insert into patient(user_email,patient_history,blood_group,age)" + "values('" + email
                + "','"
                + medical + "','" + blood + "','" + age + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public int AssignBed(Patient patient) {
        int patient_id = patient.getPatient_id();
        int bed_no = patient.getBed_no();
        String updaateQuery = "update patient set bed_no='" + bed_no + "' where patient_id='" + patient_id + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updaateQuery);
        return result;

    }

    

    public ResultSet selectDetails() {
        String selectQuery = " select patient.patient_id,concat(user_login.user_fname,'" + ""
                + "',user_login.user_lname) as name,patient.age,user_login.gender,patient.blood_group,user_login.user_contact from patient join user_login on patient.user_email = user_login.user_email ";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int resetStatus(Patient patient) {
        String updateQuery = "update patient set status='" + "inactive" + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet fetch() {
        String query = "select user_email,patient_id,age,blood_group,patient_history from patient where status='"
                + "active" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }

    public int updatestatus(Patient patient) {
        int id = patient.getPatient_id();
        String updateQuery = "update patient set status='" + "active" + "' where patient_id='" + id + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet selectPatientId(Patient patient) {
        String selectQuery = "select patient_id from patient where status='" + "active" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int updatePatient(Patient patient) {
        int age = patient.getAge();
        String medical = patient.getPatient_history();
        String blood = patient.getBlood_group();
        dbConnection = new DbConnection();
        String Query = "update patient set age='" + age + "',patient_history='" + medical + "',blood_group='" + blood
                + "' where status='"+"active"+"'";
        int result = dbConnection.manipulate(Query);
        return result;
    }

    public ResultSet selectEmail(Patient patient){
       int  id = patient.getPatient_id();
       String query = "select user_email from patient where patient_id='"+id+"'";
       dbConnection = new DbConnection();
       ResultSet result= dbConnection.retrieve(query);
       return result;
    }

    public int deletePatient(Patient patient){
        int id  = patient.getPatient_id();
        String Query = "delete from patient where patient_id='"+id+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(Query);
        return result;
    }

    public ResultSet selectPatinetEmail(){
        // int id = patient.getPatient_id();
        String query = "select user_email from patient ";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }
}
