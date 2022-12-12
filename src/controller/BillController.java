package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Bill;

public class BillController {
    DbConnection dbConnection;

    public int insertdetails(Bill bill) {
        String email = bill.getEmail();
        String date = bill.getDate();

        String query = "insert into bill(user_email,date,status) values('" + email + "','" + date + "','"+"active"+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);

        return result;
    }

    public ResultSet selectBill() {
        String query = "select bill.bill_id,concat(user_login.user_fname,'" + " "
                + "',user_login.user_lname),bill.date from bill join user_login on bill.user_email=user_login.user_email where bill.status='"
                + "active" + "'";
        dbConnection = new DbConnection();
        ResultSet rs = dbConnection.retrieve(query);
        return rs;
    }
}
