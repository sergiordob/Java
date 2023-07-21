import java.util.Scanner;
import java.util.Scanner;

public class Exercise538
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String decimalNumberString;
        String octalNumberToString = " ";

        int decimalNumberStringToInt;
        int octalNumber;
        int amount;

        System.out.print("Enter the decimal number: ");
        decimalNumberString = input.nextLine();
        decimalNumberStringToInt = Integer.parseInt(decimalNumberString);

        while (decimalNumberStringToInt != 0)
        {
            octalNumber = decimalNumberStringToInt % 8;
            decimalNumberStringToInt /= 8;

            switch (octalNumber)
            {
                /*
                REMEMBER: when you are concatenating characters, you are joining them
                to the string that was previously declared with a whitespace on the first character: whitespace + chars
                 */
                case 0: octalNumberToString += '0'; break;
                case 1: octalNumberToString += '1'; break;
                case 2: octalNumberToString += '2'; break;
                case 3: octalNumberToString += '3'; break;
                case 4: octalNumberToString += '4'; break;
                case 5: octalNumberToString += '5'; break;
                case 6: octalNumberToString += '6'; break;
                case 7: octalNumberToString += '7'; break;
                default: break;
            }
        }

        amount = octalNumberToString.length(); //If the string has 5 chars: 0 to 4, where 0 is the whitespace

        System.out.print("Octal number = ");

        for (int i = amount - 1; i > 0; i--)
        //Note that if the string has 4 chars, it is 0 to 3, and one of them is the whitespace.
        //Also note that this implies in amount - 1.
        //To fix the problem of the whitespace: i > 0
        {
            System.out.printf("%c", octalNumberToString.charAt(i));
        }
    }
}
