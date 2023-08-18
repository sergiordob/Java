import java.util.Scanner;
import java.util.Locale;

public class Exercise_7_12
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("Enter the elemente %d: ", i+1);
            array[i] = input.nextInt();
        }

        System.out.println();

        int[] reversedArray = reverseArray(array);

        System.out.printf("Reversed array =");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf(" %d", reversedArray[i]);
        }
    }

    public static int[] reverseArray (int[] array)
    {
        int[] reversedArray = new int[10];

        for (int i = 9, j = 0; i >= 0 && j <= 9; i--, j++)
        {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }
}
