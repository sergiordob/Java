public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(){

    }

    public Person(String name, String adress, String phone, String email){
        this.name = name;
        this.address = adress;
        this.phone = phone;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getAdress(){
        return this.address;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getEmail(){
        return this.email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAdress(String adress){
        this.address = adress;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "\nName: " + name + "\nAddress: " + address +
                "\nPhone number: " + phone + "\nEmail address: " + email;
    }
}
