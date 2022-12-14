package models;

public class Appointment {
    private int appoint_id;
    private int doctor_id;
    private String user_email;
    private String appoint_fname;
    private String appoint_lname;
    private int appoint_age;
    private String appoint_address;
    private String appoint_dob;
    private String appoint_gender;
    private String appoint_special;

    public Appointment(int appoint_id,
            int doctor_id, String user_email, String appoint_fname, String appoint_lname, int appoint_age,
            String appoint_address, String appoint_dob, String appoint_gender, String appoint_special) {
        this.appoint_id = appoint_id;
        this.doctor_id = doctor_id;
        this.user_email = user_email;
        this.appoint_fname = appoint_fname;
        this.appoint_lname = appoint_lname;
        this.appoint_age = appoint_age;
        this.appoint_address = appoint_address;
        this.appoint_dob = appoint_dob;
        this.appoint_gender = appoint_gender;
        this.appoint_special = appoint_special;

    }

    public void setAppointId(int newAppointId) {
        this.appoint_id = newAppointId;
    }

    public int getAppointId() {
        return this.appoint_id;
    }

    public void setDoctorId(int newDoctorId) {
        this.doctor_id = newDoctorId;
    }

    public int getDoctorId() {
        return this.doctor_id;
    }

    public void setUserEmail(String newUserEmail) {
        this.user_email = newUserEmail;
    }

    public String getUserEmail() {
        return this.user_email;
    }

    public void setAppointfName(String newAppointfName) {
        this.appoint_fname = newAppointfName;
    }

    public String getAppointfName() {
        return this.appoint_fname;
    }

    public void setAppointlName(String newAppointlName) {
        this.appoint_lname = newAppointlName;
    }

    public String getAppointlName() {
        return this.appoint_lname;

    }

    public void setAppointAge(int newAppointAge) {
        this.appoint_age = newAppointAge;
    }

    public int getAppointAge() {
        return this.appoint_age;
    }

    public void setAppointAddress(String newAppointAddress) {
        this.appoint_address = newAppointAddress;
    }

    public String getAppointAddress() {
        return this.appoint_address;
    }

    public void setAppointdob(String newAppointdob) {
        this.appoint_dob = newAppointdob;
    }

    public String getAppointdob() {
        return this.appoint_dob;
    }

    public void setAppointGender(String newAppointGender) {
        this.appoint_gender = newAppointGender;
    }

    public String getAppointGender() {
        return this.appoint_gender;
    }

    public void setAppointSpecial(String newAppointSpecial) {
        this.appoint_special = newAppointSpecial;
    }

    public String getAppointSpecial() {
        return this.appoint_special;
    }
    // public static void main(String[] args) {
    // new Student(10,null,null,null,0);
    // }
}