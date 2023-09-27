/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_12_04;

/**
 *
 * @author Sergio
 */
public class QuotientWithExcpetion {
    
    public static int quotient(int number1, int number2){
        
        if (number2 == 0){
           throw new ArithmeticException("Divisor cannot be zero"); //construtor da exceção
        }
            
        return number1 / number2;
    }
    
}
