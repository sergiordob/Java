import java.util.Scanner;
import java.util.Locale;

public class Exercise539
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double commissionSought = 0.0;
        double salesAmount = 0.0;
        double commission = 0.0;
        double money = 0.0;

        System.out.print("Enter the commission sought: ");
        commissionSought = input.nextDouble();

        //The sales amount starts with 0.01 as described. After this, the commission is compared with the commission sought.
        //if the commission is less than the commission sought (eg: $30.000, continue to increment $0.01)
        
        for (salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01)
        {
            money = 0.0;
            commission = 0.0;

            if (salesAmount >= 0.01)
                commission += money * 0.08;
        }
    }
}