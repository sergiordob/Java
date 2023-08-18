import java.util.Scanner;
import java.util.Locale;

public class Exercise_7_25
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double[] coefficients= new double[3];
        double[] roots = new double[2];

        System.out.print("Enter the coefficients a: ");
        coefficients[0] = input.nextDouble();
        System.out.print("Enter the coefficients b: ");
        coefficients[1] = input.nextDouble();
        System.out.print("Enter the coefficients c: ");
        coefficients[2] = input.nextDouble();

        printRoots(coefficients, roots);
    }

    public static double delta(double[] coefficients)
    {
        double delta = 0.0;

        delta = Math.pow(coefficients[1], 2.0) - (4 * (coefficients[0]) * (coefficients[2]));

        return delta;
    }

    public static double[] solveQuadratic(double[] coefficients)
    {
        double[] roots = new double[2];

        roots[0] = (-1 * ( coefficients[1] - Math.sqrt(delta(coefficients)))) / (2 * coefficients[0]);
        roots[1] = (-1 * ( coefficients[1] + Math.sqrt(delta(coefficients)))) / (2 * coefficients[0]);

        return roots;
    }

    public static void printRoots(double[] coefficients, double[] roots)
    {
        if (delta(coefficients) > 0)
        {
            roots = solveQuadratic(coefficients);
            System.out.printf("First and Second roots = %.2f and %.2f", roots[0], roots[1]);
        }
        else if (delta(coefficients) == 0)
        {
            System.out.printf("First and Second roots = %.2f", roots[0]);
        }
        else
        {
            System.out.print("Not real roots");
        }
    }
}
