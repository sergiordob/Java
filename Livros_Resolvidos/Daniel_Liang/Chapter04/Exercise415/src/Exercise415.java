import java.util.Scanner;

public class Exercise415
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        char character;
        int  value=0;

        System.out.print("Enter a letter: ");
        character = input.nextLine().charAt(0);

        switch (character)
        {
            case 'a':
            case 'A': value = 0;    break;
            case 'b':
            case 'B': value = 1;    break;
            case 'c':
            case 'C': value = 2;    break;
            case 'd':
            case 'D': value = 3;    break;
            case 'e':
            case 'E': value = 4;    break;
            case 'f':
            case 'F': value = 5;    break;
            case 'g':
            case 'G': value = 6;    break;
            case 'h':
            case 'H': value = 7;    break;
            case 'i':
            case 'I': value = 8;    break;
            case 'j':
            case 'J': value = 9;    break;
            default: System.out.print("Invalid input.");
        }
        System.out.print("Number is " + value);
    }
}
