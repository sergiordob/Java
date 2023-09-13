import java.util.Scanner;
import java.util.Locale;
import br.com.classes.*;

public class Exercise_09_09 {
    public static void main (String[] args)
    {
        RegularPolygon polygonOne = new RegularPolygon();
        RegularPolygon polygonTwo = new RegularPolygon(6,4);
        RegularPolygon polygonThree = new RegularPolygon(10,4, 5.6, 7.8);

        System.out.printf("Perimeter = %.2f%nArea = %.2f%n%n", polygonOne.getPerimeter(), polygonOne.getArea());
        System.out.printf("Perimeter = %.2f%nArea = %.2f%n%n", polygonTwo.getPerimeter(), polygonTwo.getArea());
        System.out.printf("Perimeter = %.2f%nArea = %.2f%n%n", polygonThree.getPerimeter(), polygonThree.getArea());

        
    }
}
