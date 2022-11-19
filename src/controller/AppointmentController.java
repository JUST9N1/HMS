package controller;

import database.DbConnection;
import models.Appointment;

public class AppointmentController {
    DbConnection dbConnection;

    public int insertAppointment(Appointment appoint) {
        String fname = appoint.getAppointfName();
        String lname = appoint.getAppointlName();
        int age = appoint.getAppointAge();
        String address = appoint.getAppointAddress();
        String dob =appoint.getAppointdob();
        String gender = appoint.getAppointGender();
        String special = appoint.getAppointSpecial();
        String insertQuery ="insert into appointment(appoint_fname,appoint_lname,appoint_age,appoint_address,appoint_date,appoint_gender,appoint_special)"
                + "values('"+fname+"','"+lname+"','"+age+"','"+address+"','"+dob+"','"+gender+"','"+special+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
}