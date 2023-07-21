import java.util.Scanner;
import java.util.Locale;

public class Exercise530
{
    public static void main (String[] args)
    {
        Locale.setDefault((Locale.US));

        Scanner input = new Scanner(System.in);

        double amount = 0.0;
        double annualInterestRate = 0.0;
        double monthlyInterestRate = 0.0;
        double totalAtTheEndOfMonth = 0.0;
        int numberOfMonths = 0;

        System.out.print("Enter an amount: ");
        amount = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        annualInterestRate = input.nextDouble();
        monthlyInterestRate = (annualInterestRate / 100 ) / 12;

        totalAtTheEndOfMonth = 100.3125;

        System.out.print("Enter the number of months: ");
        numberOfMonths = input.nextInt();

        for (int i = 2; i <= numberOfMonths; i++) //Considering that i = 1 it is referent to the first month, previoulsy inputted.
        {
            totalAtTheEndOfMonth = (100 + totalAtTheEndOfMonth) * (1 + 0.003125);
            System.out.printf("Total at the end of month %d: %.3f%n", i, totalAtTheEndOfMonth);
        }
    }
}
