import java.util.Scanner;

public class Exercise_6_21
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String string;

        System.out.print("Enter a string: ");
        string = input.nextLine();

        //isCharReturnString(string);
        getNumberFromUpperCaseString(isCharReturnUpperCaseString(string));
    }
    //getNumber(Character.toUpperCase(string.charAt(i)))
    public static String isCharReturnUpperCaseString (String string)
    {
        char characterToUpperCase;
        String stringToUpperCase = "x";

        for(int i = 0; i < string.length(); i++)
        {
            if (Character.isLetter(string.charAt(i)))
            {
                characterToUpperCase = Character.toUpperCase(string.charAt(i));
                stringToUpperCase += characterToUpperCase;
            }
        }
        stringToUpperCase = stringToUpperCase.substring(1,5); //o endINDEX = 5 não é contado. É intervalo aberto.
        return stringToUpperCase;
    }
    static int getNumberFromUpperCaseString(String stringToUpperCase)
    {
        int digit = 0;

        for (int i = 0; i < stringToUpperCase.length(); i++)
        {
            if (stringToUpperCase.charAt(i) == 'W')
            {
                digit = 0;
            }
        }
        return digit;
    }
}
