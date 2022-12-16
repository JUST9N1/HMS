package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Medicine;

public class MedicineController {
    DbConnection dbConnection;
    public ResultSet fetchMedicineName(Medicine medicine ){
        int id = medicine.getMed_id();

        String selectQuery="select med_name from medicine where med_id='"+id+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public ResultSet fetchMedicineId(){
        String selectQuery = "select med_id from medicine ";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

}
