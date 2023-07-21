import java.util.Scanner;

public class Exercise547
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String string;

        int sum = 0;
        int checksum = 0;
        int digit = 0;

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        string = input.nextLine();

        if (string.length() == 12)
        {
            for (int i = 0; i <= 11; i++) //roda todos os caracteres da string
            {
                switch (string.charAt(i))
                {
                    case '0': digit = 0; break;
                    case '1': digit = 1; break;
                    case '2': digit = 2; break;
                    case '3': digit = 3; break;
                    case '4': digit = 4; break;
                    case '5': digit = 5; break;
                    case '6': digit = 6; break;
                    case '7': digit = 7; break;
                    case '8': digit = 8; break;
                    case '9': digit = 9; break;
                    default: break;
                }

                if (i == 0)
                {
                    sum += digit;
                }

                if ( i > 0 )
                {
                    if (i % 2 != 0)
                    {
                        sum += 3*digit;
                    }
                    else
                    {
                        sum += digit;
                    }
                }
            }

            checksum = 10 - (sum) % 10;

            System.out.printf("The ISBN-13 number is: ");

            if (checksum == 10)
            {
                checksum = 0;

                System.out.printf("%s%d", string, checksum);
            }
            else
            {
                checksum = 10 - (sum) % 10;
                System.out.printf("%s%d", string, checksum);
            }
        }
        else
        {
            System.out.print("invalid ISBN!");
        }
    }
}


