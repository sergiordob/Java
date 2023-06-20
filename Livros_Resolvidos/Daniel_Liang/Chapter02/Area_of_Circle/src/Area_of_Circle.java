import java.util.Scanner;

public class Area_of_Circle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        AreaC area = new AreaC();

        double radius;

        System.out.print("Enter the radius value: ");
        radius = input.nextDouble();

        System.out.printf("Area of the Circle: %.2f", area.getArea(radius));
    }
}
