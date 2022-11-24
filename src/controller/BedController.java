package controller;

import database.DbConnection;
import models.Bed;

public class BedController {
    DbConnection dbConnection;

    public int insertdetails(Bed bed) {
        int ward_no = bed.getWardNo();
        String ward_type = bed.getWardType();
        String bed_type = bed.getBedType();
        String bed_size = bed.getBedSize();

        String insertQuery = "insert into bed(ward_no,ward_type,bed_type,bed_size)" +
                "values('" + ward_no + "','" + ward_type + "','" + bed_type + "','" + bed_size + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
}
