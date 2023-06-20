import java.util.Scanner;

public class Exercise331
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double yuan;
        double conversion = 0.0;

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int option = input.nextInt();

        if (option == 0)
        {
            System.out.print("Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();
            conversion = rate*dollarAmount;
            System.out.printf("%.2f dollar is %.2f yuan", dollarAmount, conversion);
        }
        else if (option == 1)
        {
            System.out.print("Enter the yuan amount: ");
            double yuanAmount = input.nextDouble();
            conversion = yuanAmount/rate;
            System.out.printf("%.2f yuan is %.2f dolar", yuanAmount, conversion);
        }
    }
}
