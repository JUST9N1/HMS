package models;

public class Bed {
    private int bed_no;
    private int ward_no;
    private String bed_type;
    private String bed_size;
    private String ward_type;

    public Bed(int bed_no,
    int ward_no,
    String bed_type,
    String bed_size,
    String ward_type){
        this.bed_no = bed_no;
        this.ward_no = ward_no;
        this.bed_type = bed_type;
        this.bed_size = bed_size;
        this.ward_type = ward_type;
    }

    public Bed(int i, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    public void setBedNo(int newBedNo){
        this.bed_no = newBedNo;
    }

    public int getBedNo(){
        return this.bed_no;
    }

    public void setWardNo(int newWardNo){
        this.ward_no = newWardNo;
    }

    public int getWardNo(){
        return this.ward_no;
    }

    public void setBedType(String newBedType){
        this.bed_type = newBedType;
    }

    public String getBedType(){
        return this.bed_type;
    }

    public void setBedSize(String newBedSize){
        this.bed_size = newBedSize;
    }

    public String getBedSize(){
        return this.bed_size;
    }

    public void setWardType(String newWardType){
        this.ward_type = newWardType;
    }

    public String getWardType(){
        return this.ward_type;
    }


}
