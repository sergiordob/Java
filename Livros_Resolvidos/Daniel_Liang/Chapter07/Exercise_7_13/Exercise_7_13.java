import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Exercise_7_13
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int index = 0;

        System.out.printf("Enter the number of elements: ");
        index = input.nextInt();

        int[] array = new int[index];

        for (int i = 0; i < index; i++)
        {
            System.out.printf("Enter the element %d: ", i + 1);
            array[i] = input.nextInt();
        }

        System.out.printf("Random number = %d", getRandom(array));
    }
    public static int getRandom (int[] array)
    {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        int randomValue = array[randomIndex];

        return randomValue;
    }
}
