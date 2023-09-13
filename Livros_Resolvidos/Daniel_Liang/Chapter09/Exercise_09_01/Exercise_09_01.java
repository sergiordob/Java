import java.util.Scanner;
import java.util.Locale;

public class Exercise_09_01
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Rectangle rectangleOne = new Rectangle(4.0, 40.0);
        Rectangle rectangleTwo = new Rectangle(3.5, 35.9);

        System.out.printf("R1: a = %.2f   p = %.2f", rectangleOne.getArea(), rectangleOne.getPerimeter());
        System.out.printf("%nR1: a = %.2f   p = %.2f", rectangleTwo.getArea(), rectangleTwo.getPerimeter());
    }
}
