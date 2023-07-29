import java.util.Scanner;

public class Exercise_6_1
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Enter an integer value for n: ");
        n = input.nextInt();

        System.out.printf("Pentagonal number (n = %d) = %d%n", n, Pentagonal(n));
        System.out.println();
        TestPentagonal();

    }
    public static int Pentagonal (int n)
    {
        int pentagonalNumber = n * ( (3 * n) -1) / 2;

        return pentagonalNumber;
    }

    public static void TestPentagonal()
    {
        System.out.printf("Test for n equals to 0 - 100: ");
        System.out.println();
        for (int i = 1; i <= 100; i++)
        {
            System.out.printf("%d  ", Pentagonal(i));

                if (i % 10 == 0)
                {
                    System.out.println();
                }
        }
    }
}
