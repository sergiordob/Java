import java.util.Scanner;

public class Exercise_6_20
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String string;

        System.out.print("Enter a string: ");
        string = input.nextLine();
        System.out.printf("The string has %d digits.", countLetters(string));
    }

    public static int countLetters(String string)
    {
        int countLetters = 0;

        for(int i = 0; i < string.length(); i++)
        {
            countLetters++;
        }
        return countLetters;
    }
}
