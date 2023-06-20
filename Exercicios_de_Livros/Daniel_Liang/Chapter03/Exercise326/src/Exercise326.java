import java.util.Scanner;

public class Exercise326
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a integer: ");
        number = input.nextInt();

        if ( (number % 5 == 0) && (number % 6 == 0) )
        {
            System.out.println("Divisible by 5 and 6");
        }
        if ( (number % 5 == 0) || (number % 6 == 0) )
        {
            System.out.println("Divisible by 5 or 6");
        }
        if ( (number % 5 == 0) ^ (number % 6 == 0) )
        {
            System.out.println("Divisible by 5 or 6, but not both");
        }
    }
}
