import java.util.Locale;
import java.util.Scanner;

public class Exercise_7_10
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

        System.out.printf("Index of the largest element in the array = %d", max(array));
    }

    public static int max(double[] array)
    {
        double max = 0.0;
        int index = 0;

        for (int i = 0; i < 5; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
                index = i+1;
            }
        }

        return index;
    }
}
