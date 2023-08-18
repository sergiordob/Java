import java.util.Locale;
import java.util.Scanner;

public class Exercise_7_11
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int index = 0;

        System.out.print("Enter the amount of numbers: ");
        index = input.nextInt();

        int[] array = new int[index];

        for (int i = 0; i < index; i++)
        {
            System.out.printf("Enter the element %d: ", i + 1);
            array[i] = input.nextInt();
        }

        System.out.printf("Mean = %.2f%n", mean(array));
        System.out.printf("Deviation = %.2f%n", deviation(array, mean(array)));
    }
    public static double mean (int[] array)
    {
        int sum = 0;
        double mean = 0.0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        mean = ((double) sum / (double) array.length);

        return mean;
    }
    public static double deviation (int[] array, double mean)
    {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++)
        {
            sum += Math.pow((array[i] - mean), 2.0);
        }

        double deviation = (sum / (double) array.length);

        return deviation;
    }
}
