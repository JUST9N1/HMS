package models;

public class Bill{
    private int bill_id;
private String date;
private String email;
private int total;

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

    public Bill(int bill_id, String date, String email, int total) {
        this.bill_id = bill_id;
        this.date = date;
        this.email = email;
        this.total = total;
    }
}