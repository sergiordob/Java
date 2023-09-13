import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Locale;

public class Exercise_09_05
{
    public static void main (String[] args)
    {
        long number = 1234567898765L;

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        /*GregorianCalendar.DAY_OF_MONTH não é um método, mas uma constante de campo estático na classe GregorianCalendar.
        Essa constante é usada como argumento para o método get() para especificar qual campo do calendário você deseja obter,
        neste caso, o campo "dia do mês".
         */
        System.out.printf("Current year: %d%n", gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.printf("Current month: %d%n", gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.printf("Current day: %d%n%n", gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        gregorianCalendar.setTimeInMillis(number);

        System.out.printf("Current year: %d%n", gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.printf("Current month: %d%n", gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.printf("Current day: %d%n%n", gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
