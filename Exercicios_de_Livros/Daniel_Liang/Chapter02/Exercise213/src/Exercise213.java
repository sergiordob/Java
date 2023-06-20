import java.util.Scanner;

public class Exercise213
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calculus calculus = new Calculus();

        double monthly_amount;

        System.out.print("Enter the monthly saving amount: ");
        monthly_amount = input.nextDouble();

        System.out.printf("After the sixth month, the account value is: %.3f", calculus.getPay(monthly_amount));
    }
}
