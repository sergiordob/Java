import java.util.Scanner;

public class Exercise215
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Distance distance = new Distance();

        double x1, x2, y1, y2;

        System.out.print("Enter x1, x2, y1, y2: ");
        x1 = input.nextDouble();
        x2 = input.nextDouble();
        y1 = input.nextDouble();
        y2 = input.nextDouble();

        System.out.printf("The distance between the two points is: %.3f", distance.getDistance(x1,x2,y1,y2));
    }
}
