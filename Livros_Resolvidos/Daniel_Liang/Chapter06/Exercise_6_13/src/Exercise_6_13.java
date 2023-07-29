import java.util.Scanner;
import java.util.Locale;

public class Exercise_6_13
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter an integer number: ");
        number = input.nextInt();

        GetDisplay(number);
    }

    public static void GetDisplay(int number)
    {
        double result;
        double sum = 0.0;

        System.out.println("I             m(i)");
        System.out.println("__________________");
        for (int i = 1; i <= number; i++)
        {
           result = (double) i / (double) (i+2);
           sum += result;

           System.out.printf("%d      %.4f%n",i, sum);
        }
    }

}
