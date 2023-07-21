import java.util.Scanner;
import java.util.Locale;

public class Exercise541
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int flag = 1;
        int max = 1;
        int number;
        int cont = 0;

        System.out.print("Enter integers with space(Enter 0 to finish): ");
        number = input.nextInt();

        while (number != 0)
        {
            number = input.nextInt();

            if (number >= max)
            {
                max = number;
                if (number == max)
                {
                    cont++;
                }
            }
        }
        System.out.printf("%n%d is the largest integer and appeared %d times%n", max, cont);
    }
}
