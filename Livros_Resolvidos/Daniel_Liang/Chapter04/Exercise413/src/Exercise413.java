import java.util.Scanner;

public class Exercise413
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        //String string;
        char character;
        System.out.print("Enter a letter: ");
        character = input.nextLine().charAt(0);
        //string = input.nextLine();
       // character = string.charAt(0);
        switch (character)
        {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u': System.out.println("Vogal"); break;
            default:
                if (Character.isLetter(character))
            {
                System.out.println("Consonant.");
            } else
            {
                System.out.println("Invalid input.");
            }
                break;
        }
    }
}
