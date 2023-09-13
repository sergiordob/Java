package br.com.classes;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return (Math.pow(b,2.0) - 4 * a * c);
    }

    public double getRootOne(){
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRootTwo(){
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

}
