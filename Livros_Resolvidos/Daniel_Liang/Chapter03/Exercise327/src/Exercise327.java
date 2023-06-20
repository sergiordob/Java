import java.util.Scanner;

public class Exercise327 //This problem is solved using the algorithm to "barycentric coordinates"
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double x = 0.0;
        double y = 0.0;
        //Triangle coordinates
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 100.0;
        double x3 = 200.0;
        double y3 = 0.0;

        System.out.print("Enter the x and y coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();

        //Barycentric algorithm applied
        double lambda1 = (100.0*(x - 200.0) + (200.0*y)) / ((100.0)*(-200.0));
        double lambda2 = (-200.0*y) / (100.0*(-200.0));
        double lambda3 = 1 - lambda1 - lambda2;

        if ( (lambda1 >=0 && lambda1 <=1) && (lambda2 >=0 && lambda2 <=1) && (lambda3 >=0 && lambda3 <=1) )
        {
            System.out.print("The point is in the triangle.");
        }
        else
        {
            System.out.print("The point is not in the triangle");
        }
    }
}
