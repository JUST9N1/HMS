package controller;

import database.DbConnection;
import models.Doctor;

public class DoctorController {
    DbConnection dbConnection;

    public int insertdetails(Doctor doctor){
        String fname = doctor.getdoctorfName();
        String lname = doctor.getdoctorlName();
        String age = doctor.getdoctorAge();
        String department = doctor.getDoctorDepartment();
        String special = doctor.getdoctorSpecial();

        String insertQuery = "insert into doctor(fname,lname,age,department,specialist)"+ "values('"+fname+"','"+lname+"','"+age+"','"+department+"','"+special+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
}
