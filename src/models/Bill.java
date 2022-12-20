package models;

public class Bill{
    private int bill_id;
private String date;
private String email;
private int total;
private int med_total;
private int test_total;

    public Bill(int bill_id, String date, String email, int total, int med_total, int test_total) {
        this.bill_id = bill_id;
        this.date = date;
        this.email = email;
        this.total = total;
        this.med_total = med_total;
        this.test_total = test_total;
    }

    public int getMed_total() {
        return this.med_total;
    }

    public void setMed_total(int med_total) {
        this.med_total = med_total;
    }

    public int getTest_total() {
        return this.test_total;
    }

    public void setTest_total(int test_total) {
        this.test_total = test_total;
    }

    public int getBill_id() {
        return this.bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
}