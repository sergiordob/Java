import java.util.Scanner;

public class Exercise414
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        char character;

        System.out.print("Enter a letter grade: ");
        character = input.nextLine().charAt(0);

        switch (character)
        {
            case 'a':
            case 'A': System.out.print("Numeric value: 4"); break;
            case 'b':
            case 'B': System.out.print("Numeric value: 3"); break;
            case 'c':
            case 'C': System.out.print("Numeric value: 2"); break;
            case 'd':
            case 'D': System.out.print("Numeric value: 1"); break;
            case 'f':
            case 'F': System.out.print("Numeric value: 0"); break;
            default: System.out.print("Invalid input"); break;
        }
    }
}
