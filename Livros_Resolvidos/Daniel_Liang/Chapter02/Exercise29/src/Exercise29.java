import java.util.Scanner;

public class Exercise29
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Acceleration modifier = new Acceleration();

        double v1, v2, t;

        System.out.print("Enter V2, V1 and T: ");
        v2 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();

        System.out.printf("Acceleration = %.2f", modifier.getAcceleration(v2,v1,t));
    }
}