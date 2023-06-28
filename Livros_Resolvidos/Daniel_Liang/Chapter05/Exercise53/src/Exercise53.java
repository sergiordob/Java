import java.util.Scanner;
import java.util.Locale;

public class Exercise53
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        for (int Celsius = 0; Celsius <= 100; Celsius++)
        {
            if (Celsius % 2 == 0)
            {
                double Fahrenheit = Celsius * 9/5 + 32;

                System.out.println("Celsius \tFahrenheit");
                System.out.printf("%d               %.2f%n", Celsius, Fahrenheit);
            }
        }
    }
}
