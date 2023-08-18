import java.util.Scanner;
import java.util.Locale;

public class Exercise_7_8
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int[] arrayInt = new int[10];
        double[] arrayDbl = new double[10];

        for(int i = 0; i < 5; i++)
        {
            System.out.printf("Enter the integer value %d: ", i);
            arrayInt[i] = input.nextInt();
        }

        System.out.println();

        for(int i = 0; i < 5; i++)
        {
            System.out.printf("Enter the double value %d: ", i);
            arrayDbl[i] = input.nextDouble();
        }

        System.out.printf("Average of the integers numbers: %.2f%n", average(arrayInt));
        System.out.printf("Average of the double numbers: %.2f%n", average(arrayDbl));
    }

    public static double average(int[] array)
    {
        int sum = 0;
        int count = 0;

        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
            count++;
        }

        double average =  ((double) sum / count);

        return average;
    }

    public static double average(double[] array)
    {
        double sum = 0;
        int count = 0;

        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
            count++;
        }
        double average =  ((double) sum / count);

        return average;
    }
}
