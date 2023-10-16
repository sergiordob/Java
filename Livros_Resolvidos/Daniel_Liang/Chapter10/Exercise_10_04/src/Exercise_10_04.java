import br.com.classes.*;
import java.util.Scanner;
import java.util.Locale;

public class Exercise_10_04 {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);

        MyPoint p1 = new MyPoint(0.0,0.0);
        MyPoint p2 = new MyPoint(4.0, 4.0);

        System.out.printf("Point One = (%.1f;%.1f)%n", p1.getX(), p1.getY());
        System.out.printf("Point Two = (%.1f;%.1f)%n", p2.getX(), p2.getY());
        System.out.printf("Distance p1 : p2 = %.3f%n", p1.distanceA(p2));
        System.out.printf("Distance p1 : p2 = %.3f%n", p1.distanceB(4.0,4.0));
        System.out.printf("Distance p1 : p2 = %.3f%n", MyPoint.distance(p1,p2));
    }
}
