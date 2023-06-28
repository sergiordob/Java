import java.util.Scanner;

public class Exercise422
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String stringOne = null;
        String stringTwo = null;

        System.out.print("Enter the first string: ");
        stringOne = input.nextLine();
        System.out.print("Enter the second string: ");
        stringTwo = input.nextLine();

        if (stringOne.contains(stringTwo))
        {
            System.out.println("The second string is a substring of the first string.");
        } else
        {
            System.out.println("The second string is not a substring of the first string.");
        }


    }
}

