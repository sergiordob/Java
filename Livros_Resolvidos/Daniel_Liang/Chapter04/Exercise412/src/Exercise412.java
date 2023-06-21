import java.util.Scanner;

public class Exercise412
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String string = new String();

        char[] stringCharToUpperCase = new char[4];

        System.out.print("Enter a HEX digit (0-F): ");
        string = input.nextLine();

        char charPosition = string.charAt(0);
        char charUpperCase = Character.toUpperCase(charPosition);

        if (Character.isDigit(charUpperCase))
        {
            int numberDecimal;

            switch (charUpperCase)
            {
                case 'A': numberDecimal = 10; break;
                case 'B': numberDecimal = 11; break;
                case 'C': numberDecimal = 12; break;
                case 'D': numberDecimal = 13; break;
                case 'E': numberDecimal = 14; break;
                case 'F': numberDecimal = 15; break;
            }
        }
        /*for (int i = 0; i <= 3; i++)
        {
            stringCharToUpperCase[i] = string.charAt(i);
        }*/

    }
}
