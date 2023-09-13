package br.com.classes;
import java.util.Date;

public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date(); // Inicialize o dateCreated com a data atual
    }

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }

    public String getDateCreated()
    {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate()
    {
        return this.getAnnualInterestRate() / 12.0;
    }

    public double getMonthlyInterest()
    {
        return balance * (this.getMonthlyInterestRate() / 100);
    }

    public void withdraw(double withdraw)
    {
        this.balance -= withdraw;
    }

    public void deposit(double deposit)
    {
        this.balance += deposit;
    }

}
