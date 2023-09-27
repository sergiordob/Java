/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listing_12_04;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Listing_12_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //int max = Integer.MAX_VALUE;
        
        System.out.print("Enter two integers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        
        try{
            int result = QuotientWithExcpetion.quotient(number1, number2);
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("Exception: an integer cannot be divided by zero.");
        }
        System.out.println("Execution continues...");
    } 
}
