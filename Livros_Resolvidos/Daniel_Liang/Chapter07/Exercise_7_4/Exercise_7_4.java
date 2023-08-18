import java.util.Scanner;
import java.util.Locale;

public class Exercise_7_4
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double number = 1000.0;
        double[] array = new double[100];
        int index = 0;
        double sum = 0.0;
        int count = 0;
        double average = sum / count;

        for (int i = 0; i < 100; i++)
        {
            System.out.printf("Enter an integer number: ");
            array[i] = input.nextDouble();

            if (array[i] < 0)
            {
                break;
            }

            sum += array[i];
            count++;
        }

        average = sum / count;
        System.out.printf("%nSum = %.2f%n", sum);
        System.out.printf("Amount of Numbers = %d%n", count);
        System.out.printf("Average = %.2f%n", average);
        System.out.printf("Numbers Above the Average = %.2f%n", aboveAverage(array, average, count));
        System.out.printf("Numbers Equal the Average = %.2f%n", equalAverage(array, average, count));
    }

    public static double aboveAverage(double[] array, double average, int count)
    {
        int numbersAbove = 0;

        for (int i = 0; i < count; i++)
        {
            if (array[i] < average)
            {
                numbersAbove++;
            }
        }
        return numbersAbove;
    }

    public static double equalAverage(double[] array, double average, int count)
    {
        int numbersEqual = 0;

        for (int i = 0; i < count; i++)
        {
            if (array[i] == average)
            {
                numbersEqual++;
            }
        }
        return numbersEqual;
    }
}
