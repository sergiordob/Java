import java.util.Scanner;

public class Exercise322
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double x, y;

        System.out.print("Enter a point with two coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();

        if ( Math.sqrt( Math.pow(x,2.0) + Math.pow(y,2.0) ) <= 10 )
        {
            System.out.print("The point is in the circle.");
        }
        else
        {
            System.out.print("The point is out of the circle.");
        }

    }
}
