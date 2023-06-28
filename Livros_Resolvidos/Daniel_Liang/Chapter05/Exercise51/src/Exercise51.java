import java.util.Scanner;
import java.util.Locale;

public class Exercise51
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int score = 0;

        while (score != -1)
        {
            System.out.print("Enter your exam: ");
            score = input.nextInt();

            if (score != -1)
            {
                if (score >= 60)
                {
                    System.out.print("You pass the exam.");
                }
                else
                {
                    System.out.print("You do not pass the exam.");
                }
            }
        }
    }
}
