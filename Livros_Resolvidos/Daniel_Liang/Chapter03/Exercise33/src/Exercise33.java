import java.util.Scanner;

public class Exercise33
{
    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Cramer cramer = new Cramer();

        double a,b,c,d,e,f;

        System.out.print("Enter a,b,c,d,e,f: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        if (cramer.getDeterminant(a,b,c,d,e,f) == 0)
        {
            System.out.print("The equation has no solution.");
        }
        else
        {
            System.out.println("X = " + cramer.getFirstVariable(a,b,c,d,e,f));
            System.out.print("Y = " + cramer.getSecondVariable(a,b,c,d,e,f));
        }
    }
}
