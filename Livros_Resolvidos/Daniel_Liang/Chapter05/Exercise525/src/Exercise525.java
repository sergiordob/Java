//Formula used: 4 * (-1)^n / (2n + 1)  n: 0 -> oo

import java.util.Scanner;

public class Exercise525
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int j = 0;
        double sum = 0.0;

        System.out.print("Enter the value of i: ");
        i = input.nextInt();

        for (j = 0; j <= i; j++)
        {
            sum += Math.pow(-1, j) / (2 * j + 1);
            System.out.printf("%.2f%n", sum);
        }
        System.out.printf("Value of pi: %.10f%n", 4*sum);
    }
}
