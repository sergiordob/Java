import java.util.Scanner;

public class Exercise420
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String string = null;

        char stringFirstCharacter = '\0';
        int length;

        System.out.print("Enter a string: ");
        string = input.nextLine();
        stringFirstCharacter = string.charAt(0);
        length = string.length();

        System.out.printf("Length: %d  First Character: %s", length,stringFirstCharacter);
    }
}
