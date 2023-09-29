/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_12_03;

import java.util.InputMismatchException;

/**
 *
 * @author Sergio
 */
public class Calendar {
    
    private String[] months;
    private int[] amountOfDaysInTheMonth;
    private String number;
    private int stringToNumber;
    private String monthReturn;
    private int dayReturn;

    //Construtor padrão (default)
    public Calendar() {
        // Inicialize os arrays vazios
        this.months = new String[12]; //os arrays estao como nulls
        this.amountOfDaysInTheMonth = new int[12]; //os inteiros estao com zeros
        this.number = "";
    }
    
    //Construtor sobrecarregado
    public Calendar(String[] months, int [] amountOfDaysInTheMonth, String number){
        System.arraycopy(months, 0, this.months, 0, 12);
        System.arraycopy(amountOfDaysInTheMonth, 0, this.amountOfDaysInTheMonth, 0, 12);
        this.number = number;
    }
    
    //Sets
    public void setMonth(String[] months){
        this.months = months;
    }
    
    public void setAmountOfDaysInTheMonth(int [] amountOfDaysInTheMonth){
        this.amountOfDaysInTheMonth = amountOfDaysInTheMonth;
    }
    
    public void setNumber(String number){
        try{
            this.stringToNumber = Integer.parseInt(number);
        }
        catch (InputMismatchException e){
            System.out.println("Not an integer number.");
        }  
    }
    
    //Gets
    public String[] getMonth(){
        return this.months;
    }
    
    public int[] getAmountOfDaysInTheMonth(){
        return this.amountOfDaysInTheMonth;
    }
    
    public int getNumber(){
        return this.stringToNumber;
    }
    
    public int getDataDay(){
       return this.dayReturn;
    }
    
    public String getDataMonth(){   
      return this.monthReturn;
    }
    
    //toString()
    public void returnDataDay(String number){
       try{
           this.dayReturn = amountOfDaysInTheMonth[Integer.parseInt(number)];
           System.out.printf("Day = %d%n", this.dayReturn);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Out of Bounds.");
       }
    }
    
    public void returnDataMonth(String number){   
       try{
           this.monthReturn = months[Integer.parseInt(number)];
           System.out.printf("Month = %s%n", this.monthReturn);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Out of Bounds.");
       }
    }
}
