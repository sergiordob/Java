import java.util.Scanner;
import java.util.Locale;

public class Exercise_6_8
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        double mile = 1.0;
        double kilometer = 20.0;

        GetDisplay(mile, kilometer);
    }

    public static double MileToKilometer(double mile)
    {
        double kilometer = 1.609 * mile;
        return kilometer;
    }

    public static double KilometerToMile(double kilometer)
    {
        double mile = kilometer / 1.609;
        return mile;
    }
    public static void GetDisplay(double mile, double kilometer)
    {
        System.out.println("Miles Kilometers  |  Kilometers   Miles");
        System.out.println("----------------------------------------");
        for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5)
        {
            System.out.printf("%d      %.3f  |  %d            %.3f%n",i, MileToKilometer(i),j, KilometerToMile(j));
        }
    }
}
