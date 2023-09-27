/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listing_12_07;

/**
 *
 * @author Sergio
 */
public class CircleWithException {
    
    private double radius;
    private static int numberOfObjects = 0;
    
    //Default constructor
    public CircleWithException(){
        this.radius = 1.0;
    }
    
    //Customized constructor
    public CircleWithException(double radius){
        this.radius = radius;
        //setRadius(radius);
        numberOfObjects++;
    }
    
    //Get radius
    public double getRadius(){
        return this.radius;
    }
    
    //Set radius with exception handling
    //declaring a exception by "throws"
    public void setRadius(double radius) throws IllegalArgumentException{ 
        if (radius >= 0){
            this.radius = radius;
            numberOfObjects++;
        }
        else {
            throw new IllegalArgumentException("Radius cannot be negative");
        } 
    }
    
    //Get number of objects
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
    //getArea
    public double getArea(){
        return this.radius * this.radius * 3.14;
    }
    
}
