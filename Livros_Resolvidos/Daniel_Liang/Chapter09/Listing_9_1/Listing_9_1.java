import java.util.Scanner;
import java.util.Locale;

public class Listing_9_1
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        //Primeira instancia (sem argumento -> default: raio = 1.0)
        Circle circleOne = new Circle();
        System.out.printf("Area = %.2f%n", circleOne.getArea());
        System.out.printf("Perimeter = %.2f%n%n", circleOne.getPerimeter());

        //Segunda instancia (raio = 25)
        Circle circleTwo = new Circle(25);
        System.out.printf("Area = %.2f%n", circleTwo.getArea());
        System.out.printf("Perimeter = %.2f%n%n", circleTwo.getPerimeter());

        //Segunda instancia (raio = 125)
        Circle circleThree = new Circle(125);
        System.out.printf("Area = %.2f%n", circleThree.getArea());
        System.out.printf("Perimeter = %.2f%n%n", circleThree.getPerimeter());

        //Modificando o raio por meio da variavel de classe
        circleTwo.radius = 100;
        System.out.printf("Area = %.2f%n", circleTwo.getArea());
        System.out.printf("Perimeter = %.2f%n%n", circleTwo.getPerimeter());

    }
}


