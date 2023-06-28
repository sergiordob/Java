import java.util.Scanner;
import java.util.Locale;

public class Exercise424
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String firstCountry = null;
        String secondCountry = null;
        String thirdCountry = null;

        System.out.print("Enter the first country: ");
        firstCountry = input.nextLine();
        System.out.print("Enter the second country: ");
        secondCountry = input.nextLine();
        System.out.print("Enter the third country: ");
        thirdCountry = input.nextLine();

    }
}
