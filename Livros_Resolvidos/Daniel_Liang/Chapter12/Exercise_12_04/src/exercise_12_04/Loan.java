/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_12_04;

/**
 *
 * @author Sergio
 */
public class Loan {
    
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** Default constructor */
    public Loan() {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
    }
    
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
    return this.annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) throws (IllegalArgumentException){ //AQUI
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Annual interest rate must be greater than 0");
	}
        else{
          this.annualInterestRate = annualInterestRate;  
        }
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
    return numberOfYears;
    }

    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) { //AQUI
       this.numberOfYears = numberOfYears;     
    }

    /** Return loanAmount */
    public double getLoanAmount() {
    return loanAmount;
    }

    /** Set a new loanAmount */
    public void setLoanAmount(double loanAmount) { //AQUI  
        this.loanAmount = loanAmount;  
    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = (loanAmount * monthlyInterestRate / (1.0 - (1.0 / Math.pow(1.0 + monthlyInterestRate, numberOfYears * 12.0))));
    return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;
    }

    /** Return loan date */
    public java.util.Date getLoanDate() {
    return loanDate;  
    }
}
