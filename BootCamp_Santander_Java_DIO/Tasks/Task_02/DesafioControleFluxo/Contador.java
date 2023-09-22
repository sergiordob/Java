//IMPORTANT: USE JDK 20.0

import java.util.Scanner;
import java.util.Locale;

public class Contador
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numberOne = 0;
        int numberTwo = 0;

        System.out.print("Enter the first integer number: ");
        numberOne = input.nextInt();
        System.out.print("Enter the second integer number: ");
        numberTwo = input.nextInt();

        try
        {
            count(numberOne, numberTwo);
        }
        catch (ParametrosInvalidosException e)
        {
            System.err.println(e.getMessage());
        }
    }

    static void count(int numerOne, int numbrTwo) throws ParametrosInvalidosException
    {
        if (numerOne < numbrTwo)
        {
            int count = numbrTwo - numerOne;

            System.out.print("Numbers:");
            for(int i = 1; i <= count; i++)
            {
                System.out.printf(" %d", i);
            }
        } else
        {
            throw new ParametrosInvalidosException();
        }
    }
}
