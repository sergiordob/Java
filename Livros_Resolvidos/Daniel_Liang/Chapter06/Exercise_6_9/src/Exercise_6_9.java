import java.util.Scanner;
import java.util.Locale;

public class Exercise_6_9
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        double pound = 20.0;
        double kilogram = 1.0;

        GetDisplay(pound, kilogram);
    }

    public static double PoundToKilogram(double pound)
    {
        double kilogram = pound * 0.4536;
        return kilogram;
    }

    public static double KilogramToPound(double kilogram)
    {
        double pound = kilogram / 0.4536;
        return pound;
    }
    public static void GetDisplay(double kilogram, double pound)
    {
        System.out.println("Kilograms   Pounds  |  Pounds   Kilograms");
        System.out.println("----------------------------------------");
        for (int i = 1, j = 20; i <= 199 && j <= 515; i += 3, j += 5)
        {
            System.out.printf("%d      %.1f  |  %d            %.2f%n",i, KilogramToPound(i),j, PoundToKilogram(j));
        }
    }
}
