import br.com.classes.*;
import java.util.Scanner;
import java.util.Locale;

public class Exercise_10_11 {
    public static void main (String[] args){

        Circle2D c1 = new Circle2D(2.0,2.0,5.5);
        Circle2D c2 = new Circle2D(4.0,5.0,10.5);
        Circle2D c3 = new Circle2D(3.0, 5.0, 2.3);

        System.out.printf("Area = %.2f%n", c1.getArea());
        System.out.printf("Perimeter = %.2f%n", c1.getPerimeter());
        System.out.printf("Point is inside the circle? %b%n", c1.contains(3.0,3.0));
        System.out.printf("C1 contains C2? %b%n", c1.containsCircle(c2));
        System.out.printf("C1 overlaps C3? %b%n", c1.overlaps(c3));



    }
}
