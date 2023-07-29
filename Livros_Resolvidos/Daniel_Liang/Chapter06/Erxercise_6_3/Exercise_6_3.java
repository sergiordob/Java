import java.util.Scanner;

public class Exercise_6_3
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.printf("%b", isPalindrome(number));
    }
    public static int reverse(int number)
    {
        String reversedNumberToString = "";
        int result;
        int reversedNumber;

        result = number;

        while (result > 0)
        {
            reversedNumberToString += Integer.toString(result % 10);
            result /= 10;
        }

        reversedNumber = Integer.parseInt(reversedNumberToString);

        return reversedNumber;
    }
    public static boolean isPalindrome(int number)
    {
       if (number == reverse(number))
       {
           return true;
       }
       else
       {
           return false;
       }
    }
}
