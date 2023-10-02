/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_12_04;
import java.util.*;

/**
 *
 * @author Sergio
 */
public class Exercise_12_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = scanner.nextDouble();

        // Enter number of years
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = scanner.nextInt();

        // Enter loan amount
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = scanner.nextDouble();

        // Create a Loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        
        // Display loan date, monthly payment, and total payment
        //System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(),loan.getTotalPayment());
        System.out.printf("%.2f", loan.getAnnualInterestRate());
    } 
}
