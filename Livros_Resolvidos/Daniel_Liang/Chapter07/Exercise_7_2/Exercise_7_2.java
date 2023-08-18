import java.util.Scanner;
import java.util.Locale;

public class Exercise_7_2
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double[] arrayOfStudents;

        System.out.print("Enter the number os students: ");
        arrayOfStudents = new double[input.nextInt()];

        for (int i = 0; i < arrayOfStudents.length; i++)
        {
            System.out.printf("Grade of the student %d: ", i);
            arrayOfStudents[i] = input.nextInt();
        }

        printArray(reverseArray(arrayOfStudents));
    }

    public static double[] reverseArray(double[] arrayOfStudents)
    {
        double[] reversedArray = new double[arrayOfStudents.length];

        for (int i = arrayOfStudents.length - 1, j = 0; i >= 0 && j < arrayOfStudents.length; i--, j++)
        {
            reversedArray[j] = arrayOfStudents[i];
        }

    return reversedArray;
    }

    public static void printArray(double[] array)
    {
        System.out.printf("Reversed Array = ");
        for (int i = 0 ; i < array.length; i++)
        {
            System.out.printf("%.1f ", array[i]);
        }
    }
}
