import java.util.Scanner;

public class Exercise22
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        Polygon cylinder = new Polygon();

        double radius, area, length;

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        System.out.print("Enter the length: ");
        length = input.nextInt();

        area = cylinder.getArea(radius);

        System.out.printf("Area = %.2f%nVolume = %.2f%n", area, cylinder.getVolume(area, length));

    }
}
