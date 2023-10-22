public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phone, String email, String office, String salary, String date, String title){
        super(name, address, phone, email, office, salary, date);
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String toString(){
        return super.toString() + "\nTitle: " + title;
    }
}
