import java.util.Scanner;

public class Exercise_6_37
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int width;
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.print("Enter the width: ");
        width = input.nextInt();

        System.out.printf("%s", format(number, width));
    }

    public static String format(int number, int width)
    {
        int count = 0;
        int result = number;
        int numberOfZeros;
        String numberToString = Integer.toString(number);
        String finalNumber = " ";
        String zeros = "0";

        while (result >=1 )
        {
            result /= 10;
            count++;
        }

        if (width > count)
        {
            numberOfZeros = width - count;

            for (int i = 1; i < numberOfZeros; i++)
            {
                zeros += '0';
            }
            finalNumber = numberToString + zeros;
        }
        else
        {
            finalNumber = "The length is less than the number of existing numbers";
        }

    return finalNumber;
    }
}
