/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_01_c;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Project_01_c {

    /**
     * @param args the command line arguments 
     */
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        //Local variables
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
        
        System.out.print("Enter the name: ");
        tempName = scanner.next();
        System.out.print("Enter the number: ");
        tempNumber = scanner.nextInt();
        System.out.print("Enter the quantity: ");
        tempQty = scanner.nextInt();
        System.out.print("Enter the price: ");
        tempPrice = scanner.nextDouble();
        
        Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);
        
        System.out.printf("%n%s", p1.toString());
        
        System.out.print("\nEnter the name: ");
        tempName = scanner.next();
        System.out.print("Enter the number: ");
        tempNumber = scanner.nextInt();
        System.out.print("Enter the quantity: ");
        tempQty = scanner.nextInt();
        System.out.print("Enter the price: ");
        tempPrice = scanner.nextDouble();
          
        Product p6 = new Product(tempNumber, tempName, tempQty, tempPrice);
        p6.setIsActive(false);
        
        System.out.printf("%n%s", p6.toString());
        
        scanner.close();
          
    }
    
}

