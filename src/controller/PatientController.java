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
        String insertQuery = "insert into patient(user_email,patient_history,blood_group)" + "values('" + email + "','"
                + medical + "','" + blood + "')";
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

    public ResultSet selectDetails(Patient patient) {
        String selectQuery = " select patient.patient_id,concat(user_login.user_fname,'" + ""
                + "',user_login.user_lname) as name,patient.age,user_login.gender,patient.blood_group,user_login.user_contact from patient join user_login on patient.user_email = user_login.user_email ";
                dbConnection = new DbConnection();
            ResultSet result = dbConnection.retrieve(selectQuery);
            return result;
    }

    public int resetStatus(Patient patient){
        String updateQuery = "update patient set status='"+"inactive"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public int updatestatus(Patient patient){
        int id = patient.getPatient_id();
        String updateQuery = "update patient set status='"+"active"+"' where patient_id='"+id+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet selectPatientId(Patient patient){
        String selectQuery = "select patient_id from patient where status='"+"active"+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
}
