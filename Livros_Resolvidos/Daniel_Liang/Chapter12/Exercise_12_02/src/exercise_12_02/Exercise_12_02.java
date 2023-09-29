/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_12_02;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Sergio
 */
public class Exercise_12_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] amountOfDaysInTheMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int number;
        
        System.out.print("Enter an integer number: ");
        number = scanner.nextInt();
        
        Calendar calendarOne = new Calendar();
        
        calendarOne.setMonth(months);                                           //enviar todo o array de meses
        calendarOne.setAmountOfDaysInTheMonth(amountOfDaysInTheMonth);          //enviar todo o array da quantidade de dias do mes
        calendarOne.setNumber(number);                                          //enviar o numero inteiro escolhido para mapear mes e dias
        
        calendarOne.returnDataDay(number);
        calendarOne.returnDataMonth(number);
        
    }
}
