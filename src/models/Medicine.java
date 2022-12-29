package models;

public class Medicine {
    private int med_id;
    private String med_name;
    private int med_rate;
    private int med_quantity;

    public int getMed_id() {
        return this.med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public String getMed_name() {
        return this.med_name;
    }

    public void setMed_name(String med_name) {
        this.med_name = med_name;
    }

    public int getMed_rate() {
        return this.med_rate;
    }

    public void setMed_rate(int med_rate) {
        this.med_rate = med_rate;
    }

    public int getMed_quantity() {
        return this.med_quantity;
    }

    public void setMed_quantity(int med_quantity) {
        this.med_quantity = med_quantity;
    }

    public Medicine(int med_id, String med_name, int med_rate, int med_quantity) {
        this.med_id = med_id;
        this.med_name = med_name;
        this.med_rate = med_rate;
        this.med_quantity = med_quantity;
    }


}
