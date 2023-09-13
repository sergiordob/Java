import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

public class Exercise_09_03
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Date date = new Date();

        for (long i = 10000; i <= 1e11; i *= 10)
        {
            date.setTime(i);
            System.out.println(date.toString()); //toString, nesse caso, é um método da classe Date.
        }
    }
}
