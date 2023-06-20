import java.util.Scanner;

public class Exercise212
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calculus calculus = new Calculus();

        double speed;
        double acceleration;

        System.out.print("Enter the speed and the acceleration: ");
        speed = input.nextDouble();
        acceleration = input.nextDouble();

        System.out.printf("Runway Length = %.3f", calculus.getLength(speed, acceleration));
    }
}
