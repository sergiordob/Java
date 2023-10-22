public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email, String office, String salary, String date, String officeHours, String rank){
        super(name, address, phone, email, office, salary, date);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours(){
        return this.officeHours;
    }

    public String getRank(){
        return this.rank;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours +
                "\nRank: " + rank;
    }
}

