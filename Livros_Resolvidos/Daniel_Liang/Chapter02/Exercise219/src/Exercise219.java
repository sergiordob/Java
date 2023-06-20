import java.util.Scanner;

public class Exercise219
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();

        double x1, y1, x2, y2, x3, y3;

        System.out.print("Enter the coordinates of three points separeted by spaces: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        System.out.printf("The area of the triangle is %.3f", triangle.getArea(x1,y1,x2,y2,x3,y3));
    }
}
