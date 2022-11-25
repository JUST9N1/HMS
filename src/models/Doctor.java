package models;

public class Doctor {
    private int doctor_id;
    private String doctor_fname;
    private String doctor_lname;
    private String doctor_age;
    private String doctor_department;
    private String doctor_special;

    public Doctor(int doctor_id,
    String doctor_fname,
    String doctor_lname,
    String doctor_age,
    String doctor_department,
    String doctor_special){
        this.doctor_id = doctor_id;
        this.doctor_fname = doctor_fname;
        this.doctor_lname = doctor_lname;
        this.doctor_age = doctor_age;
        this.doctor_department = doctor_department;
        this.doctor_special = doctor_special;
    }

    public void setDoctorid(int newDoctorId){
        this.doctor_id = newDoctorId;
    }

    public int getDoctorId(){
        return this.doctor_id;
    }
    public void setdoctorfName(String newdoctorfName){
        this.doctor_fname = newdoctorfName;
    }

    public String getdoctorfName(){
        return this.doctor_fname;
    }
    public void setAppointlName(String newdoctorlName){
        this.doctor_lname = newdoctorlName;
    }

    public String getdoctorlName(){
        return this.doctor_lname;

    }

    public void setdoctorAge(String newdoctorAge){
        this.doctor_age = newdoctorAge;
    }

    public String getdoctorAge(){
        return this.doctor_age;
    }

    public void setDoctorDepartment(String newDoctorDepartment){
        this.doctor_department = newDoctorDepartment;
    }

    public String getDoctorDepartment(){
        return this.doctor_department;
    }

    public void setdoctorSpecial(String newdoctorSpecial){
        this.doctor_special = newdoctorSpecial;
    }

    public String getdoctorSpecial(){
        return this.doctor_special;
    }
}
