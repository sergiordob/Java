import java.util.Scanner;

public class Exercise221
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        Fature fature = new Fature();

        System.out.print("Enter investment amount: ");
        double investment_amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annual_interest_rate_porcentage = input.nextDouble();
        System.out.print("Enter number of years: ");
        double number_of_years = input.nextDouble();

        System.out.printf("Fature value %.2f", fature.getFature(investment_amount,annual_interest_rate_porcentage,number_of_years));

    }
}
