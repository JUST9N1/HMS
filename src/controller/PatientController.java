package controller;

import database.DbConnection;
import models.Patient;

public class PatientController {
    DbConnection dbConnection;

    public int insertDetails(Patient patient){
        String history = patient.getPatientHistory();
        String email = patient.getUserEmail();

        String insertQuery = "insert into patient(user_email,patient_history)";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
}
