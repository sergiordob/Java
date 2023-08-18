import java.util.Scanner;

public class Exercise_7_22
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String string = "";

        System.out.print("Enter a string: ");
        string = input.next();

        printArray(stringToArray(string));
    }

    public static int[] stringToArray(String string)
    {
        char[] array = new char[string.length()];
        int[] answer = new int[2];
        int lowerCase = 0;
        int upperCase = 0;

        for(int i = 0; i < string.length(); i++)
        {
            array[i] = string.charAt(i);

            if(Character.isLowerCase(array[i]))
            {
                lowerCase++;
            }
            else if (Character.isUpperCase(array[i]))
            {
                upperCase++;
            }
        }

        answer[0] = lowerCase;
        answer[1] = upperCase;

        return answer;
    }

    public static void printArray(int[] array)
    {
        System.out.printf("Number of lower case: %d", array[0]);
        System.out.printf("%nNumber of upper case: %d", array[1]);
    }
}
