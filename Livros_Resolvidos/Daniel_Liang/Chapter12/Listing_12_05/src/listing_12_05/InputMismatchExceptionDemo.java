/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listing_12_05;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class InputMismatchExceptionDemo {
    
    Scanner scanner = new Scanner(System.in);
    static int number;
    
    public void inputMismatchExceptionDemo(){
    
        boolean input = true;
        
        while (input != false){
            try{
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
        
                System.out.print("Number entered: " + number);
                input = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again");
                scanner.nextLine();
            }
        }
    }   
}
