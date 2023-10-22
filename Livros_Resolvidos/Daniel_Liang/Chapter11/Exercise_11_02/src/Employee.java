public class Employee extends Person{
    private String office;
    private String salary;
    private String date;

    public Employee(String name, String address, String phone, String email, String office, String salary, String date){
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this. date = date;
    }

    public String getOffice(){
        return this.office;
    }

    public String getSalary(){
        return this.salary;
    }

    public String getDate(){
        return this.date;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String toString(){
        return super.toString() + "\nOffice: " + office +
                "\nSalary: $" + getSalary() + "\nDate hired: " + getDate();
    }
}
