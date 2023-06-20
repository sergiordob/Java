import java.util.Scanner;

public class Exercise31
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Equation equation = new Equation();

        double a, b, c;

        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (equation.getDelta(a,b,c) < 0)
        {
            System.out.print("No Real Roots!");
        }
        else
        {
            System.out.println("Root 1: " + equation.getRoot1(a,b,c));
            System.out.print("Root 2: " + equation.getRoot2(a,b,c));
        }
    }
}
