import java.util.Scanner;

public class Exercise549
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String string;
        char blankSpace = ' ';
        int contVowel = 0;
        int contConsonants = 0;


        System.out.print("Enter a string with just vowels and consonants: ");
        string = input.nextLine();

        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == ' ')
            {
                i++;
            }

            switch( string.charAt(i) )
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U': contVowel++; break;
                default: contConsonants++; break;
            }
        }
        System.out.printf("Vowels: %d    Consoants: %d", contVowel, contConsonants);
    }
}
