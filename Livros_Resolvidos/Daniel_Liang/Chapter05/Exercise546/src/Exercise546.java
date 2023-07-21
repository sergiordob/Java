import java.util.Scanner;

public class Exercise546
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String string = " ";

        System.out.print("Enter a string: ");
        string = input.nextLine();

        int length = string.length();

        for (int i = length - 1; i >= 0; i--)
        {
            System.out.printf("%c", string.charAt(i));
        }
    }
}
