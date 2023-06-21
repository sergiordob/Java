import java.util.Scanner;

public class Exercise418
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String stringLevel = null;
        String stringSubject = null;

        char character = '\0';
        int number = 0;

        System.out.print("Enter (M-C-I): ");
        character = input.nextLine().charAt(0);
        System.out.print("Enter (1-2-3-4): ");
        number = input.nextInt();

        switch (character)
        {
            case 'M':
                stringLevel = "Mathematics";
                if (number == 1)
                {
                    stringSubject = "Freshman";
                } else if (number == 2)
                {
                    stringSubject = "Sophomore";
                } else if (number == 3)
                {
                    stringSubject = "Junior";
                } else if (number == 4)
                {
                    stringSubject = "Senior";
                }
                break;
            case 'C':
                stringLevel = "Computer Science";
                if (number == 1)
                {
                    stringSubject = "Freshman";
                } else if (number == 2)
                {
                    stringSubject = "Sophomore";
                } else if (number == 3)
                {
                    stringSubject = "Junior";
                } else if (number == 4)
                {
                    stringSubject = "Senior";
                }
                break;
            case 'I':
                stringLevel = "Information Technology";
                if (number == 1)
                {
                    stringSubject = "Freshman";
                } else if (number == 2)
                {
                    stringSubject = "Sophomore";
                } else if (number == 3)
                {
                    stringSubject = "Junior";
                } else if (number == 4)
                {
                    stringSubject = "Senior";
                }
                break;
            default:
                System.out.print("Invalid input");
        }
        System.out.printf("%s  %s", stringLevel, stringSubject);
    }
}
