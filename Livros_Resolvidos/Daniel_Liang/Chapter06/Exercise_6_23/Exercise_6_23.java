import java.util.Scanner;

public class Exercise_6_23
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String string;
        String characterString;
        char character;

        System.out.print("Enter a string: ");
        string = input.nextLine();
        System.out.print("Enter the character: ");
        characterString = input.nextLine();
        character = characterString.charAt(0);
        System.out.printf("The string has %d characters", getStringCountChars(string, character));
    }
    public static int getStringCountChars(String string, char character)
    {
        int count = 0;

        for(int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == character)
            {
                count++;
            }
        }
        return count;
    }
}
