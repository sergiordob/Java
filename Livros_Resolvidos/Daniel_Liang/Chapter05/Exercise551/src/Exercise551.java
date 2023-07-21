import java.util.Scanner;

public class Exercise551
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String string1;
        String string2;

        int lowest;

        System.out.print("Enter the first string: ");
        string1 = input.nextLine();
        System.out.print("Enter the first string: ");
        string2 = input.nextLine();

        if (string1.length() < string2.length())
        {
            lowest = string1.length();
        }
        else
        {
            lowest = string2.length();
        }

        for (int i = 0; i < lowest; i++)
        {
            if (string1.charAt(i) == string2.charAt(i))
            {
                System.out.printf("%c", string1.charAt(i));
            }
        }
    }
}
