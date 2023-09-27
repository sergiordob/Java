/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listing_12_07;

/**
 *
 * @author Sergio
 */
public class Listing_12_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try{
            CircleWithException circleOne = new CircleWithException();
            CircleWithException circleTwo = new CircleWithException();
            
            circleOne.setRadius(2);
            circleTwo.setRadius(-2);
        }
        catch (IllegalArgumentException e){
            System.out.printf("%s%n", e.getMessage());
        }
        
        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
    }
    
}
