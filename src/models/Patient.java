package models;

public class Patient {
    private int patient_id;
    private int appoint_id;
    private int doctor_id;
    private String user_email; 
    private String patient_history;
    private String blood_group;
    
    private int bed_no;
    
    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }
    public int getPatient_id() {
        return this.patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getAppoint_id() {
        return this.appoint_id;
    }

    public void setAppoint_id(int appoint_id) {
        this.appoint_id = appoint_id;
    }

    public int getDoctor_id() {
        return this.doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getUser_email() {
        return this.user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getPatient_history() {
        return this.patient_history;
    }

    public void setPatient_history(String patient_history) {
        this.patient_history = patient_history;
    }

    public int getBed_no() {
        return this.bed_no;
    }

    public void setBed_no(int bed_no) {
        this.bed_no = bed_no;
    }

    public Patient(int patient_id, int appoint_id, int doctor_id, String user_email, String patient_history, String blood_group, int bed_no) {
        this.patient_id = patient_id;
        this.appoint_id = appoint_id;
        this.doctor_id = doctor_id;
        this.user_email = user_email;
        this.patient_history = patient_history;
        this.blood_group = blood_group;
        this.bed_no = bed_no;
    }

    
    
    
    
   
}
