import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import br.com.classes.*;

public class Exercise_09_08
{
    public static void main (String[] args)
    {
        Fan fanOne = new Fan();
        Fan fanTwo = new Fan();

        fanOne.setSpeed(3);
        fanOne.setRadius(10.0);
        fanOne.setColor("yellow");
        fanOne.setMode(true);
        System.out.printf("%s", fanOne.toString());

        System.out.println();
        System.out.println();

        fanTwo.setSpeed(2);
        fanTwo.setRadius(5.0);
        fanTwo.setColor("blue");
        fanTwo.setMode(false);
        System.out.printf("%s", fanTwo.toString());

        System.out.println();
        System.out.println();
    }
}
