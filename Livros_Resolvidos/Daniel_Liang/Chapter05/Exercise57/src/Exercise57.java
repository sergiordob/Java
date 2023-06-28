import java.util.Scanner;
import java.util.Locale;

public class Exercise57
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int year;
        double lastTuition = 10000.0;
        double actualTuition = 0.0;
        double sumOfTenYears = 0.0;
        double sum = 0.0;

        for (year = 1; year <= 14; year++)
        {
            actualTuition = lastTuition * 0.06 + lastTuition;
            System.out.printf("Year = %d    Tuition = %.2f%n", year, actualTuition);
            lastTuition = actualTuition;

            if (year > 10)
            {
                sum += actualTuition;
            }
        }
        System.out.printf("Sum %.2f", sum);
    }
}
