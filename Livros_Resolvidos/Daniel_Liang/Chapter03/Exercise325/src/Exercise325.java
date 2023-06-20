import java.util.Scanner;

public class Exercise325
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double x_coordinate_point_one = 0.0;
        double y_coordinate_point_one = 0.0;
        double x_coordinate_point_two = 0.0;
        double y_coordinate_point_two = 0.0;

        double x_coordinate_point_three = 0.0;
        double y_coordinate_point_three = 0.0;
        double x_coordinate_point_four = 0.0;
        double y_coordinate_point_four = 0.0;

        double x_line_one = 0.0;
        double y_line_one = 0.0;
        double x_line_two = 0.0;
        double y_line_two = 0.0;

        double angular_coefficient_line_one = y_line_one/x_line_one;
        double linear_coefficient_line_one =  (y_line_one - (angular_coefficient_line_one*x_line_one));

        double angular_coefficient_line_two = y_line_two/x_line_two;
        double linear_coefficient_line_two =  (y_line_two - (angular_coefficient_line_two*x_line_two));

        double determinant = angular_coefficient_line_one - angular_coefficient_line_two;

        double determinant_x = linear_coefficient_line_one - linear_coefficient_line_two;
        double determinant_y = angular_coefficient_line_one*linear_coefficient_line_two - linear_coefficient_line_one*angular_coefficient_line_two;

        double x_coordinate_of_intersecting = determinant_x/determinant;
        double y_coordinate_of_intersecting = determinant_y/determinant;

        System.out.print("Line 1 - Enter point one (x y): ");
        x_coordinate_point_one = input.nextDouble();
        y_coordinate_point_one = input.nextDouble();
        System.out.print("Line 1 - Enter point two (x y): ");
        x_coordinate_point_two = input.nextDouble();
        y_coordinate_point_two = input.nextDouble();
        System.out.print("Line 2 - Enter point three (x y): ");
        x_coordinate_point_three = input.nextDouble();
        y_coordinate_point_three = input.nextDouble();
        System.out.print("Line 2 - Enter point four (x y): ");
        x_coordinate_point_four = input.nextDouble();
        y_coordinate_point_four = input.nextDouble();

        if (x_coordinate_point_two > x_coordinate_point_one)
        {
            x_line_one = (x_coordinate_point_two - x_coordinate_point_one);
        }
        else
        {
            x_line_one = (x_coordinate_point_two - x_coordinate_point_one)*(-1);
        }

        if (y_coordinate_point_two > y_coordinate_point_one)
        {
            y_line_one = (y_coordinate_point_two - y_coordinate_point_one);
        }
        else
        {
            y_line_one = (y_coordinate_point_two - y_coordinate_point_one)*(-1);
        }

        if (x_coordinate_point_four > x_coordinate_point_three)
        {
            x_line_two = (x_coordinate_point_four - x_coordinate_point_three);
        }
        else
        {
            x_line_two = (x_coordinate_point_four - x_coordinate_point_three)*(-1);
        }

        if (y_coordinate_point_four > y_coordinate_point_three)
        {
            y_line_two = (y_coordinate_point_four - y_coordinate_point_three);
        }
        else
        {
            y_line_two = (y_coordinate_point_four - y_coordinate_point_three)*(-1);
        }

        if (determinant_x == determinant_y)
        {
            System.out.printf("Point of intersecting: %.3f , %.3f", x_coordinate_of_intersecting, y_coordinate_of_intersecting);
        }
        else
        {
            System.out.print("No intersecting point");
        }

        //Reta 1: y_line_one = a*x_line_one + b
        //Reta 2: y_line_two = a*x_line_two + b

        //System.out.printf("Line 1 (x,y): %.2f , %.2f", x_line_one,y_line_one);
        //System.out.printf("Line 2 (x,y): %.2f , %.2f", x_line_two,y_line_two);

        System.out.printf("Determinant = %.3f  DeterminantX = %.3f   DeterminantY = %.3f", determinant, determinant_x, determinant_y);
    }
}
