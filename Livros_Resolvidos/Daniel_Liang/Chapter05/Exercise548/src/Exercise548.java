import java.util.Scanner;

public class Exercise548
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String string;

        System.out.print("Enter a string: ");
        string = input.nextLine();

        int length = string.length();
        int blankSpace = string.indexOf(' ');

        for (int i = 0; i < length; i++)
        {
            if (i == blankSpace) //When the compiler see the blank space, jump to the next char.
            {
                i++;
            }

            if (i % 2 != 0)
            {
                System.out.printf("%c", string.charAt(i));
            }
        }
    }
}
