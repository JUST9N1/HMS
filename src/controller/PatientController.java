package controller;

import database.DbConnection;
import models.Patient;

public class PatientController {
    DbConnection dbConnection;

    public int insertDetails(Patient patient){
        String email = patient.getUserEmail();
        String medical = patient.getPatientHistory();
        String blood = patient.getBlood_group();
        String insertQuery = "insert into patient(user_email,patient_history,blood_group)"+ "values('"+email+"','"+medical+"','"+blood+"')";
        dbConnection  = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
}
