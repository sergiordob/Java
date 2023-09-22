import br.com.classes.*;
import java.util.Scanner;
import java.util.Locale;

public class NTU_POO_02 {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangleOne = new Rectangle(1.2, 3.4);
        
        System.out.println(rectangleOne);  // toString()
        Rectangle rectangleTwo = new Rectangle();  // default constructor
        System.out.println(rectangleTwo);

        // Test setters and getters
        rectangleOne.setLength(5.6);
        rectangleOne.setWidth(7.8);
        System.out.println(rectangleOne);  // toString()
        System.out.println("length is: " + rectangleOne.getLength());
        System.out.println("width is: " + rectangleOne.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", rectangleOne.getArea());
        System.out.printf("perimeter is: %.2f%n", rectangleOne.getPerimeter());
    }
}
