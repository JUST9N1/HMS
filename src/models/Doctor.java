package models;

public class Doctor {
    private int doctor_id;
    private String doctor_fname;
    private String doctor_lname;
    private String doctor_age;
    private String doctor_department;
    private String doctor_special;
    private int rate_no;
    private int rating;

    public Doctor(int doctor_id, String doctor_fname, String doctor_lname, String doctor_age, String doctor_department, String doctor_special, int rate_no, int rating) {
        this.doctor_id = doctor_id;
        this.doctor_fname = doctor_fname;
        this.doctor_lname = doctor_lname;
        this.doctor_age = doctor_age;
        this.doctor_department = doctor_department;
        this.doctor_special = doctor_special;
        this.rate_no = rate_no;
        this.rating = rating;
    }

    public int getDoctor_id() {
        return this.doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_fname() {
        return this.doctor_fname;
    }

    public void setDoctor_fname(String doctor_fname) {
        this.doctor_fname = doctor_fname;
    }

    public String getDoctor_lname() {
        return this.doctor_lname;
    }

    public void setDoctor_lname(String doctor_lname) {
        this.doctor_lname = doctor_lname;
    }

    public String getDoctor_age() {
        return this.doctor_age;
    }

    public void setDoctor_age(String doctor_age) {
        this.doctor_age = doctor_age;
    }

    public String getDoctor_department() {
        return this.doctor_department;
    }

    public void setDoctor_department(String doctor_department) {
        this.doctor_department = doctor_department;
    }

    public String getDoctor_special() {
        return this.doctor_special;
    }

    public void setDoctor_special(String doctor_special) {
        this.doctor_special = doctor_special;
    }

    public int getRate_no() {
        return this.rate_no;
    }

    public void setRate_no(int rate_no) {
        this.rate_no = rate_no;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}