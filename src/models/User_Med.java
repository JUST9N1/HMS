package models;

public class User_Med {
    private int med_id;
    private String user_email;
    private String time;
    private String date;

    public User_Med(int med_id, String user_email, String time,String date) {
        this.med_id = med_id;
        this.user_email = user_email;
        this.time = time;
        this.date = date;
    }

    public int getMed_id() {
        return this.med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public String getUser_email() {
        return this.user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
