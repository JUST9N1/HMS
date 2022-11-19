package models;



public class User {
    private String user_fname;
    private String user_lname;
    private String user_username;
    private String user_email;
    private String user_contact;
    private String user_pass;
    private String user_dob;
    private String user_sq1;
    private String user_status;
    private String user_gender;

    public User(String user_fname,
    String user_lname,
    String user_username,
    String user_email,
    String user_contact,
    String user_pass,
    String user_dob,
    String user_sq1,
    String user_status,
    String user_gender){
        this.user_fname = user_fname;
        this.user_lname = user_lname;
        this.user_username = user_username;
        this.user_email = user_email;
        this.user_contact = user_contact;
        this.user_pass = user_pass;
        this.user_dob = user_dob;
        this.user_sq1 = user_sq1;
        this.user_status = user_status;
        this.user_gender = user_gender;
    }

    public void setUserfName(String newUserfName){
        this.user_fname=newUserfName;
    }

    public String getUserfName(){
        return this.user_fname;
    }

    public void setUserlName(String newUserlName){
        this.user_lname=newUserlName;
    }

    public String getUserlName(){
        return this.user_lname;
    }

    public void setUserName(String newUserName){
        this.user_username=newUserName;
    }

    public String getUserName(){
        return this.user_username;
    }

    public void setUserEmail(String newUserEmail){
        this.user_email=newUserEmail;
    }

    public String getUserEmail(){
        return this.user_email;
    }

    public void setUserContact(String newUserContact){
        this.user_contact=newUserContact;
    }

    public String getUserContact(){
        return this.user_contact;
    }

    public void setUserPass(String newUserPass){
        this.user_pass=newUserPass;
    }

    public String getUserPass(){
        return this.user_pass;
    }

    public void setUserDob(String newUserDob){
        this.user_dob=newUserDob;
    }

    public String getUserDob(){
        return this.user_dob;
    }

    public void setUserSq1(String newUserSq1){
        this.user_sq1=newUserSq1;
    }

    public String getUserSq1(){
        return this.user_sq1;
    }

    public void setUserStatus(String newUserStatus){
        this.user_status=newUserStatus;
    }

    public String getUserStatus(){
        return this.user_status;
    }

    public void setUserGender(String newUserGender){
        this.user_gender = newUserGender;
    }

    public String getUserGender(){
        return this.user_gender;
    }
}


