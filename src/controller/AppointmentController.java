package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Appointment;

public class AppointmentController {
    DbConnection dbConnection;

    public int insertAppointment(Appointment appoint) {
        String fname = appoint.getAppointfName();
        String lname = appoint.getAppointlName();
        int age = appoint.getAppointAge();
        String address = appoint.getAppointAddress();
        String dob = appoint.getAppointdob();
        String gender = appoint.getAppointGender();
        String special = appoint.getAppointSpecial();
        String email = appoint.getUserEmail();
        int DID = appoint.getDoctorId();
        String insertQuery = "insert into appointment(appoint_fname,appoint_lname,appoint_age,appoint_address,appoint_date,appoint_gender,appoint_special,user_email,doctor_id,appoint_status,bill)"
                + "values('" + fname + "','" + lname + "','" + age + "','" + address + "','" + dob + "','" + gender
                + "','" + special + "','" + email + "','" + DID + "','" + "1" + "','"+"unpaid"+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet joinTable(Appointment appoint) {
        String joinQuery = "select appointment.appoint_id from appointment INNER JOIN user_login ON appointment.user_email=user_login.user_email where user_login.user_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(joinQuery);
        return result;
    }

    public int changeStatus(Appointment appoint) {
        String changeQuery = "update appointment set appoint_status='" + "0" + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(changeQuery);
        return result;
    }

    public int updateStatus(Appointment appointment) {
        int id = appointment.getAppointId();
        String updateQuery = "update appointment set appoint_status='" + "1" + "' where appoint_id='" + id + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet getDetails(Appointment appoint) {
        String selectQuery = "select appoint_id,CONCAT(appoint_fname,'" + " "
                + "',appoint_lname ) as name,appoint_special from appointment where appoint_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;

    }

    public ResultSet getSpecialist(Appointment appoint) {
        String selectQuery = "select appoint_special from appointment where appoint_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int insertDID(Appointment appoint) {
        int dId = appoint.getDoctorId();
        String insertQuery = "update appointment set doctor_id='" + dId + "' , doctor_status='" + "active"
                + "' where appoint_status=1 ";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet selectdetails(Appointment appointment) {
        String selectQuery = " select appointment.appoint_id,appointment.appoint_date,CONCAT(appointment.appoint_fname , '"
                + " " + "', appointment.appoint_lname) as name,appointment.doctor_id,CONCAT(doctor.fname ,'" + " "
                + "' ,doctor.lname) as dname,appointment.appoint_special from appointment join doctor on appointment.doctor_id=doctor.doctor_id";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
    public ResultSet selectolddetails(Appointment appointment) {
        String selectQuery = " select appointment.appoint_id,appointment.appoint_date,CONCAT(appointment.appoint_fname , '"
                + " " + "', appointment.appoint_lname) as name,appointment.doctor_id,CONCAT(doctor.fname ,'" + " "
                + "' ,doctor.lname) as dname,appointment.appoint_special from appointment join doctor on appointment.doctor_id=doctor.doctor_id where user_email='"+appointment.getUserEmail()+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public ResultSet selectAppoint(Appointment appointment) {
        String selectQuery = "select user_email,appoint_id,appoint_date,appoint_special from appointment where appoint_status='"
                + "1" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int UpdateAppoint(Appointment appointment) {
        String appointDate = appointment.getAppointdob();
        String appointSPecial = appointment.getAppointSpecial();
        int appointID = appointment.getAppointId();

        String updateQuery = "update appointment set appoint_date = '" + appointDate + "',appoint_special='"
                + appointSPecial + "' where appoint_id='" + appointID + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet countAppoint(Appointment appointment) {
        String selectQuery = "select count(appointment.appoint_id) from appointment join user_login on appointment.user_email = user_login.user_email where user_login.user_status='"
                + "1" + "' and appointment.advance='" + "unpaid" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public ResultSet countAppoint_Doc(Appointment appointment) {
        String selectQuery = "select count(appointment.appoint_id) from appointment join user_login on appointment.user_email = user_login.user_email where user_login.user_status='"
                + "1" + "' and appointment.doctor_status='" + "active" + "'and appointment.bill='" + "unpaid" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int updateBill(Appointment appointment) {
        String updateQuery = "update appointment  set bill='" + "paid" + "' where user_email='"
                + appointment.getUserEmail() + "' and appointment.doctor_status='" + "active" + "' ";
                dbConnection = new DbConnection();
                int result= dbConnection.manipulate(updateQuery);
                return result;
    }

    public int payAdvance(Appointment appointment){
        String updateQuery = "update appointment  set advance='" + "paid" + "' where user_email='"
                + appointment.getUserEmail() + "'  ";
                dbConnection = new DbConnection();
                int result= dbConnection.manipulate(updateQuery);
                return result;
    }

    public int deleteAppoint(Appointment appointment){
        int id = appointment.getAppointId();
        String deleteQuery = "delete from appointment where appoint_id='"+id+"'";
        dbConnection = new DbConnection();
        
         int result = dbConnection.manipulate(deleteQuery);
        return result;
    }

}
