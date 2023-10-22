public class Student extends Person{
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;

    public Student(int status, String name, String address, String phone, String email){
        super(name, address, phone, email);
        this.status = status;
    }

    public String getStatus(){
        switch (status){
            case 1:
                return "freshman";
            case 2:
                return "sophomore";
            case 3:
                return "junior";
            case 4:
                return "senior";
            default:
                return "Null";
        }
    }

    public void setStatus(int status){
        this.status = status;
    }

    public String toString(){
        return "Status: " + getStatus() + super.toString();
    }

}
