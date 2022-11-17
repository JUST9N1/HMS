package models;

public class User {
    private String user_fname;
    private String user_lname;
    private String user_userName;
    private String user_email;
    private String user_contact;
    private String user_pass;
    private String user_dob;
    private String user_sq1;
    private boolean user_status;

    public String getUser_fname() {
        return this.user_fname;
    }

    public void setUser_fname(String user_fname) {
        this.user_fname = user_fname;
    }

    public String getUser_lname() {
        return this.user_lname;
    }

    public void setUser_lname(String user_lname) {
        this.user_lname = user_lname;
    }

    public String getUser_userName() {
        return this.user_userName;
    }

    public void setUser_userName(String user_userName) {
        this.user_userName = user_userName;
    }

    public String getUser_email() {
        return this.user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_contact() {
        return this.user_contact;
    }

    public void setUser_contact(String user_contact) {
        this.user_contact = user_contact;
    }

    public String getUser_pass() {
        return this.user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUser_dob() {
        return this.user_dob;
    }

    public void setUser_dob(String user_dob) {
        this.user_dob = user_dob;
    }

    public String getUser_sq1() {
        return this.user_sq1;
    }

    public void setUser_sq1(String user_sq1) {
        this.user_sq1 = user_sq1;
    }

    public boolean getUser_status() {
        return this.user_status;
    }

    public void setUser_status(boolean user_status) {
        this.user_status = user_status;
    }

    public User(String user_fname, String user_lname, String user_userName, String user_email, String user_contact,
            String user_pass, String user_dob, String user_sq1, boolean user_status) {
        this.user_fname = user_fname;
        this.user_lname = user_lname;
        this.user_userName = user_userName;
        this.user_email = user_email;
        this.user_contact = user_contact;
        this.user_pass = user_pass;
        this.user_dob = user_dob;
        this.user_sq1 = user_sq1;
        this.user_status = user_status;
    }
}
