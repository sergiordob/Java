import java.util.Scanner;

public class Exercise_6_19
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double sideOne, sideTwo, sideThree;

        System.out.print("Enter side one: ");
        sideOne = input.nextDouble();
        System.out.print("Enter side two: ");
        sideTwo = input.nextDouble();
        System.out.print("Enter side three: ");
        sideThree = input.nextDouble();

        if ( isValid(sideOne, sideTwo, sideThree) == true)
        {
            System.out.printf("Area = %.2f", getArea(sideOne,sideTwo,sideThree));
        }
        else
        {
            System.out.print("Not valid sides!");
        }
    }

    public static boolean isValid(double sideOne, double sideTwo, double sideThree)
    {
        boolean isValid = false;

        if ( (sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo) && (sideTwo + sideOne > sideOne) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static double getArea(double sideOne, double sideTwo, double sideThree)
    {
        double s = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt((s * (s - sideOne) * (s - sideTwo) * (s - sideThree)));

        return area;
    }
}
