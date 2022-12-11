package models;

public class Admin {




    private String admin_fname;
    private String admin_lname;
    private String admin_adminname;
    private String admin_email;
    private String admin_contact;
    private String admin_pass;
    private String admin_dob;
    private String admin_sq1;
    private String admin_status;
    private String admin_gender;

    public Admin(String admin_fname,
    String admin_lname,
    String admin_adminname,
    String admin_email,
    String admin_contact,
    String admin_pass,
    String admin_dob,
    String admin_sq1,
    String admin_status,
    String admin_gender){
        this.admin_fname = admin_fname;
        this.admin_lname = admin_lname;
        this.admin_adminname = admin_adminname;
        this.admin_email = admin_email;
        this.admin_contact = admin_contact;
        this.admin_pass = admin_pass;
        this.admin_dob = admin_dob;
        this.admin_sq1 = admin_sq1;
        this.admin_status = admin_status;
        this.admin_gender = admin_gender;
    }

    public void setadminfName(String newadminfName){
        this.admin_fname=newadminfName;
    }

    public String getadminfName(){
        return this.admin_fname;
    }

    public void setadminlName(String newadminlName){
        this.admin_lname=newadminlName;
    }

    public String getadminlName(){
        return this.admin_lname;
    }

    public void setadminName(String newadminName){
        this.admin_adminname=newadminName;
    }

    public String getadminName(){
        return this.admin_adminname;
    }

    public void setadminEmail(String newadminEmail){
        this.admin_email=newadminEmail;
    }

    public String getadminEmail(){
        return this.admin_email;
    }

    public void setadminContact(String newadminContact){
        this.admin_contact=newadminContact;
    }

    public String getadminContact(){
        return this.admin_contact;
    }

    public void setadminPass(String newadminPass){
        this.admin_pass=newadminPass;
    }

    public String getadminPass(){
        return this.admin_pass;
    }

    public void setadminDob(String newadminDob){
        this.admin_dob=newadminDob;
    }

    public String getadminDob(){
        return this.admin_dob;
    }

    public void setadminSq1(String newadminSq1){
        this.admin_sq1=newadminSq1;
    }

    public String getadminSq1(){
        return this.admin_sq1;
    }

    public void setadminStatus(String newadminStatus){
        this.admin_status=newadminStatus;
    }

    public String getadminStatus(){
        return this.admin_status;
    }

    public void setadminGender(String newadminGender){
        this.admin_gender = newadminGender;
    }

    public String getadminGender(){
        return this.admin_gender;
    }
}




