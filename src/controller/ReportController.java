package controller;

import database.DbConnection;
import models.Report;

public class ReportController {
    DbConnection dbConnection;

    public int reportDetails(Report report){
        String problem_name = report.getProblem_name();
        String problem_description = report.getProblem_description();
        String user_email = report.getUser_email();

        String insertQuery = "insert into report(problem_type,add_info,user_email)" + "values('" + problem_name + "','"
                + problem_description + "','" + user_email + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
}
