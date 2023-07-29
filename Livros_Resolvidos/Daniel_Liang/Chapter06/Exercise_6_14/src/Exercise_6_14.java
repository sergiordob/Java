import java.util.Scanner;
import java.util.Locale;

public class Exercise_6_14
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        GetDisplay();
    }
    public static void GetDisplay( )
    {
        double sum = 0;
        double pi;
        double i;

        System.out.printf("i      m(i)%n");

        for (i = 1; i <= 901; i++)
        {
            sum += Math.pow(-1, i +1) / (2 * i - 1);
            pi = 4*sum;

            if (i == 1 || i == 101 || i == 201 || i == 301 || i == 401 || i == 501 || i == 601 || i == 701 || i == 801 || i == 901)
            {
                System.out.printf("%-12.0f    %-6.4f%n", i, pi);
            }
        }
    }
}
