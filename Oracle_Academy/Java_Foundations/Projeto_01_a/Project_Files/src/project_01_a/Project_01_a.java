/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_01_a;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Project_01_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        //Using default constructor
        Product product01 = new Product();
        Product product02 = new Product();
        
        //Using overloaded constructor Product(int itemNumber, String nameOfTheProduct, int numberOfUnitsInStock, double priceOfEachUnit)
        Product product03 = new Product(01, "First", 01, 1.11);
        Product product04 = new Product(02, "Second", 02, 2.22);
        Product product05 = new Product(03, "Third", 03, 3.33);
        Product product06 = new Product(04, "Fourth", 04, 4.44);
        
        //Instance 01
        System.out.printf("%s%n%n", product01.toString());
        
        //Instance 02
        System.out.printf("%s%n%n", product02.toString());
        
        //Instance 03
        System.out.printf("%s%n%n", product03.toString());
        
        //Instance 04
        System.out.printf("%s%n%n", product04.toString());
        
        //Instance 05
        System.out.printf("%s%n%n", product05.toString());
        
        //Instance 06
        System.out.printf("%s%n%n", product06.toString());
    }
    
}

