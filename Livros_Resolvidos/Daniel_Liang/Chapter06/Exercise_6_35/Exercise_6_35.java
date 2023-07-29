import java.util.Scanner;

public class Exercise_6_35
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double side;

        System.out.print("Enter the side: ");
        side = input.nextInt();

        System.out.printf("Area = %.3f", getArea(side));
    }

    public static double getArea(double side)
    {
        double angle = 180 / 5;
        double radian = Math.toRadians(angle);
        double tangent = Math.tan(radian);
        double area = (5 * Math.pow(side,2.0)) / (4 * tangent);

        return area;
    }
}
