package models;

public class Patient {
    private int patient_id;
    private int appoint_id;
    private int doctor_id;
    private String user_email; 
    private String patient_history;
    private String blood_group;

    
    
    public Patient(int patient_id,
    int appoint_id,
    int doctor_id,
    String user_email,
    String patient_history,
    String blood_group){
        this.patient_id = patient_id;
        this.patient_history = patient_history;
        this.appoint_id = appoint_id;
        this.doctor_id = doctor_id;
        this.user_email = user_email;
        this.blood_group = blood_group;
    }
    
    public String getBlood_group() {
        return this.blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }
    public void setPatientId(int newPatientId) {
        this.patient_id = newPatientId;
    }

    public int getPatientId() {
        return this.patient_id;
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
    public void setPatientHistory(String newPatientHistory) {
        this.patient_history = newPatientHistory;
    }

    public String getPatientHistory() {
        return this.patient_history;
    }
}
