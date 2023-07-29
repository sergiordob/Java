import java.util.Scanner;

public class Exercise_6_12
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int numPerLine;

        System.out.print("Enter the first integer number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second integer number: ");
        num2 = input.nextInt();
        System.out.print("Enter the amount of numbers per line: ");
        numPerLine = input.nextInt();

        GetDisplay(num1, num2, numPerLine);
    }

    public static void GetDisplay(int num1, int num2, int numPerLine)
    {
        int max, min;

        if (num2 - num1 > 0)
        {
            max = num2;
            min = num1;
        }
        else
        {
            max = num1;
            min = num2;
        }

        int start = min + 1;

        for (int i = start; i < max; i++)
        {
            System.out.printf("%d ", i);

                if (i % numPerLine == 0)
                {
                    System.out.println();
                }
        }
    }
}
