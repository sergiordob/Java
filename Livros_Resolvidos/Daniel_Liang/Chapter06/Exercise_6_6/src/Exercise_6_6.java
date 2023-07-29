import java.util.Scanner;

public class Exercise_6_6
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter an integer: ");
        number = input.nextInt();

        getPattern(number);
    }

    public static void getPattern(int number)
    {
        String whitespace = " ";

        for (int i = 1, j = number; i <= number && j >= 1; i++, j--)
        {
            for (int k = j; k > 1; k--)
            {
                System.out.printf("%s", whitespace);
            }

            for (int z = 1; z <= i; z++)
            {
                System.out.printf("%d", z);
            }
            System.out.println();
        }
    }
}
