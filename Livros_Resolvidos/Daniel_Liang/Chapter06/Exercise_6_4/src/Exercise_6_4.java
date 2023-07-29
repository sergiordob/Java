import java.util.Scanner;

public class Exercise_6_4
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter an integer number: ");
        number = input.nextInt();
        reverseIntegerNumber(number);
    }
    public static void reverseIntegerNumber(int number)
    {
        int result;
        int printNumber = 0;

        result = number;

        System.out.print("Reversed number: ");
        while (result > 0)
        {
           printNumber = result % 10;
           System.out.printf("%d", printNumber);
           result /= 10;
        }
    }
}
