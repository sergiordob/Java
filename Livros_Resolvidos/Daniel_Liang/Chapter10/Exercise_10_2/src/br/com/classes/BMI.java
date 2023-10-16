package br.com.classes;

public class BMI {
    private String name;
    private static String status = "";
    private int age;
    private double weight;
    private double height;

    public BMI(){
        this.name = " ";
        this.age = 0;
        this.weight = 0.0;
        this.height = 0.0;
    } //peso / altura ao quadrado

    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }
    public double getBMI(){
        return (this.weight / (this.height * this.height));
    }

    public String getStatus() {
        if (getBMI() < 18.5) {
            return status = "Underweight";
        } else if (getBMI() >= 18.5 && getBMI() <= 24.9) {
            return status = "Healthy weight";
        } else {
            return status = "Overweight";
        }
    }
}
