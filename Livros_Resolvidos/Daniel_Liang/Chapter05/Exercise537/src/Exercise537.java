import java.util.Scanner;

public class Exercise537
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String decimalNumberString;
        String binaryNumberToString = " ";

        int decimalNumberStringToInt;
        int binaryNumber;
        int amount;

        System.out.print("Enter the decimal number: ");
        decimalNumberString = input.nextLine();
        decimalNumberStringToInt = Integer.parseInt(decimalNumberString);

       while (decimalNumberStringToInt != 1)
       {
           binaryNumber = decimalNumberStringToInt % 2;
           decimalNumberStringToInt /= 2;

            switch (binaryNumber)
            {
                /*
                REMEMBER: when you are concatenating characters, you are joining them
                to the string that was previously declared with a whitespace on the first character: whitespace + chars
                 */
                case 0: binaryNumberToString += '0'; break;
                case 1: binaryNumberToString += '1'; break;
                default: break;
            }
       }

        amount = binaryNumberToString.length(); //If the string has 5 chars: 0 to 4, where 0 is the whitespace

        System.out.print("Binary number = ");

        for (int i = amount - 1; i > 0; i--)
        //Note that if the string has 4 chars, it is 0 to 3, and one of them is the whitespace.
        //Also note that this implies in amount - 1.
        //To fix the problem of the whitespace: i > 0
        {
            System.out.printf("%c", binaryNumberToString.charAt(i));
        }
    }
}
