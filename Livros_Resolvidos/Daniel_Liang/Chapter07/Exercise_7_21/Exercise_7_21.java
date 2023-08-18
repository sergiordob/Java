import java.util.Scanner;

public class Exercise_7_21
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int largest = 0;

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("Enter the number %d: ", i);
            numbers[i] = input.nextInt();
        }

        int[] normalized = normalizedArray(numbers);

        System.out.printf("Normalized Array =");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf(" %d", normalized[i]);
        }
    }

    public static int largestElement(int[] array)
    {
        int largest = 0;

        for (int i = 0; i < 10; i++)
        {
            if (array[i] > largest)
            {
                largest = array[i];
            }
        }
        return largest;
    }

    public static int[] normalizedArray(int[] array)
    {
        int largest = largestElement(array);
        int[] normalizedArray = new int[array.length];

        for(int i = 0; i < array.length; i++)
        {
            normalizedArray[i] = array[i] / largest;
        }

        return normalizedArray;
    }
}
