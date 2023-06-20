import java.util.Scanner;

public class Exercise411
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a decimal value (0-15): ");
        number = input.nextInt();

        if (number >=0 && number <= 9)
        {
            System.out.print("The hex value is: " + number);
        }
        else if (number >= 10 && number <= 15)
        {
            switch (number)
            {
                case 10: System.out.print("The hex value is: A"); break;
                case 11: System.out.print("The hex value is: B"); break;
                case 12: System.out.print("The hex value is: C"); break;
                case 13: System.out.print("The hex value is: D"); break;
                case 14: System.out.print("The hex value is: E"); break;
                case 15: System.out.print("The hex value is: F"); break;
            }
        }
        else
        {
            System.out.print("Invalid number");
        }
    }
}
