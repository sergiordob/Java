/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_12_02;

/**
 *
 * @author Sergio
 */
public class Calendar {
    
    private String[] months;
    private int[] amountOfDaysInTheMonth;
    private int number;
    private String monthReturn;
    private int dayReturn;

    //Construtor padrão (default)
    public Calendar() {
        // Inicialize os arrays vazios
        this.months = new String[12]; //os arrays estao como nulls
        this.amountOfDaysInTheMonth = new int[12]; //os inteiros estao com zeros
        this.number = 0;
    }
    
    //Construtor sobrecarregado
    public Calendar(String[] months, int [] amountOfDaysInTheMonth, int number){
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
    
    public void setNumber(int number){
        this.number = number;
    }
    
    
    //Gets
    public String[] getMonth(){
        return this.months;
    }
    
    public int[] getAmountOfDaysInTheMonth(){
        return this.amountOfDaysInTheMonth;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public int getDataDay(){
       return this.dayReturn;
    }
    
    public String getDataMonth(){   
      return this.monthReturn;
    }
    
    //toString()
    public void returnDataDay(int number){
       try{
           this.dayReturn = amountOfDaysInTheMonth[number];
           System.out.printf("Day = %d%n", this.dayReturn);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Out of Bounds.");
       }
    }
    
    public void returnDataMonth(int number){   
       try{
           this.monthReturn = months[number];
           System.out.printf("Month = %s%n", this.monthReturn);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Out of Bounds.");
       }
    }
}
