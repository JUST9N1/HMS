package controller;

import database.DbConnection;
import models.Appointment;

public class AppointmentController {
    DbConnection dbConnection;

    public int insertAppointment(Appointment student) {
        String fname = student.getAppointfName();
        String lname = student.getAppointlName();
        int age = student.getAppointAge();
        String address = student.getAppointAddress();
        String dob = student.getAppointdob();
        String gender = student.getAppointGender();
        String special = student.getAppointSpecial();
        String insertQuery ="insert into appointment(appoint_fname,appoint_lname,appoint_age,appoint_address,appoint_date,appoint_gender,appoint_special)"
                + "values('"+fname+"','"+lname+"','"+age+"','"+address+"','"+dob+"','"+gender+"','"+special+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
}