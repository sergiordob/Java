import java.util.Scanner;
import java.util.Locale;

public class Exercise531
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double amount;
        double annualPercentageYield;
        double amountAtTheEndOfTheMonth;
        double monthlyPercentageYield;
        int numberOfMonths;

        System.out.print("Enter the initial deposit amount: ");
        amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        annualPercentageYield = input.nextDouble();
        System.out.print("Enter the number of months: ");
        numberOfMonths = input.nextInt();

        monthlyPercentageYield = (annualPercentageYield / 1200);
        amountAtTheEndOfTheMonth = amount + (amount * monthlyPercentageYield );

        System.out.println("Month     CD Value");

        System.out.printf("1          %.2f%n", amountAtTheEndOfTheMonth);
        for (int i = 2; i <= numberOfMonths; i++)
        {
            amountAtTheEndOfTheMonth = (amountAtTheEndOfTheMonth) * (1 + monthlyPercentageYield);
            System.out.printf("%d          %.2f%n", i, amountAtTheEndOfTheMonth);
        }
    }
}
