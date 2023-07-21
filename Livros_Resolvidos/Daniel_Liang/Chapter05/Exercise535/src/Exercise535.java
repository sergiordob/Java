import java.util.Scanner;
import java.util.Locale;

public class Exercise535
{
    public static void main (String[] args)
    {
        int numerator = 1;
        int i;
        int j;
        double firstParcel;
        double secondParcel;
        double denominator;
        double sum = 0.0;

        for (i = 1, j = 2; i <= 999 && j <= 1000; i++, j++)
        {
            firstParcel = Math.sqrt(i);
            secondParcel = Math.sqrt(j);
            denominator = firstParcel + secondParcel;
            sum += 1 / denominator;
            System.out.printf("1 / sqrt(%d) + sqrt(%d) = %.4f%n", i, j, 1/(firstParcel+secondParcel));
        }
        System.out.printf("Sum = %.4f", sum);
    }
}
