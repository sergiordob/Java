import java.util.Scanner;
import java.util.Locale;

public class Listing_9_1
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        //Circle circleOne = new Circle();

        int raiz = (int) Math.sqrt(4.0);

        double radius = 0.0;

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.printf("Area of the circle = %.2f", area);
    }
}


