import java.util.Scanner;

public class Exercise323
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double x, y;

        System.out.print("Enter a point with two coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();

        if ( (x <= 5.0 && x >= -5.0) && (y<= 2.5 && y >= -2.5) )
        {
            System.out.print("The point is in the rectangle");
        }
        else
        {
            System.out.print("The point is out the rectangle");
        }
    }
}