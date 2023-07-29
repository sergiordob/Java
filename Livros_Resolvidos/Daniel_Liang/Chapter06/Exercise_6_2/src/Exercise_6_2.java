import java.util.Scanner;

public class Exercise_6_2
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String number;

        System.out.print("Enter an integer: ");
        number = input.nextLine();
        System.out.printf("%nThe sum of the digits of the %s is: %d", number, StringToIntAndSum(number));
    }
    public static int StringToIntAndSum(String number)
    {
        int length = number.length();
        int integerNumber = Integer.parseInt(number);
        int sum = 0;
        int result = integerNumber;

        for (int i = 0; i < length; i++)
        {
            if (result <= 9)
            {
                sum += result;
            }
            else
            {
                sum += result % 10;
                result /= 10;
            }
        }
        return sum;
    }
}
