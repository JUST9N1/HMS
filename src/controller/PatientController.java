package controller;

import database.DbConnection;
import models.Patient;

public class PatientController {
    DbConnection dbConnection;

    public int insertDetails(Patient patient){
        String email = patient.getUser_email();
        String medical = patient.getPatient_history();
        String blood = patient.getBlood_group();
        String insertQuery = "insert into patient(user_email,patient_history,blood_group)"+ "values('"+email+"','"+medical+"','"+blood+"')";
        dbConnection  = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public int AssignBed(Patient patient){
        int patient_id = patient.getPatient_id();
        int bed_no = patient.getBed_no();
        String updaateQuery = "update patient set bed_no='"+bed_no+"' where patient_id='"+patient_id+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updaateQuery);
        return result;

    
    }
}
