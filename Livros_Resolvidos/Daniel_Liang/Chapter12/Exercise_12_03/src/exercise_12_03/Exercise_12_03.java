/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_12_03;
import java.util.*;


/**
 *
 * @author Sergio
 */
public class Exercise_12_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] amountOfDaysInTheMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        
        int intNumber = 0;
        String stringNumber = "";
        
        System.out.print("Enter an integer: ");
        stringNumber = scanner.nextLine();

        try {
            intNumber = Integer.parseInt(stringNumber);
        } catch (NumberFormatException e) {
            System.out.println("Not an integer. Program will exit.");
            System.exit(0); // Encerra o programa em caso de entrada inválida
        }
        
        Calendar calendarOne = new Calendar();
        
        calendarOne.setMonth(months);                                           //enviar todo o array de meses
        calendarOne.setAmountOfDaysInTheMonth(amountOfDaysInTheMonth);          //enviar todo o array da quantidade de dias do mes
        
        calendarOne.setNumber(stringNumber);    
        
        calendarOne.returnDataDay(stringNumber);
        calendarOne.returnDataMonth(stringNumber);
    }
}
