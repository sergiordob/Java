import java.util.Scanner;

public class Exercise_6_36
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n;
        double side;

        System.out.print("Enter the number of sides: ");
        n = input.nextInt();
        System.out.print("Enter the value of the sides: ");
        side = input.nextDouble();
    BHNJMK,L.Ç;
    5
        System.out.printf("Area = %.3f", getArea(n, side));
    }

    public static double getArea(int n, double side)
    {
        double angle = 180 / n;
        double radian = Math.toRadians(angle);
        double tangent = Math.tan(radian);
        double area = (n * Math.pow(side,2.0)) / (4 * tangent);

        return area;
    }
}
