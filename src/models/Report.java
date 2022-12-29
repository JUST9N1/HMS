package models;

public class Report {
    private int report_id;
    private String problem_name;
    private String problem_description;
    private String user_email;

    public int getReport_id() {
        return this.report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public String getProblem_name() {
        return this.problem_name;
    }

    public void setProblem_name(String problem_name) {
        this.problem_name = problem_name;
    }

    public String getProblem_description() {
        return this.problem_description;
    }

    public void setProblem_description(String problem_description) {
        this.problem_description = problem_description;
    }

    public String getUser_email() {
        return this.user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }


    public Report(int report_id, String problem_name, String problem_description, String user_email) {
        this.report_id = report_id;
        this.problem_name = problem_name;
        this.problem_description = problem_description;
        this.user_email = user_email;
    }

    
}
