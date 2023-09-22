package br.com.classes;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getPerimeter(){
        return length + length + width + width;
    }

    public double getArea(){
        return length * width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public String toString() {
        return "Circle[length=" + length + " width=" + width + "]";
    }

}
