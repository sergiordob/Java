import java.util.Scanner;

public class Exercise_6_10
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter an integer number: ");
        number = input.nextInt();
        printPrimeUnderTenThousand(number);

    }

    public static boolean isPrime(int number)
    {
        for (int divisor = 2; divisor <= number / 2; divisor++)
        {
            if (number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeUnderTenThousand(int number)
    {
        for (int i = 0; i < 10000; i++)
        {
            System.out.printf("Number %d, prime? %b%n", i, isPrime(i));
        }
    }
}
