import java.util.Scanner;
import java.util.Locale;

public class Exercise_7_9
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double[] array = new double[5];

        for(int i = 0; i < 5; i++)
        {
            System.out.printf("Enter the element %d: ", i+1);
            array[i] = input.nextDouble();
        }

        System.out.printf("Largest element in the array = %.2f", max(array));
    }

    public static double max(double[] array)
    {
        double max = 0.0;

        for (int i = 0; i < 5; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }

        return max;
    }
}
