import java.util.Scanner;

public class Exercise23
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        Conversion modifier = new Conversion();

        double feet;

        System.out.print("Enter the value for feet: ");
        feet = input.nextDouble();

        System.out.printf("Conversion to meters: %.3f", modifier.getConversion(feet));
    }
}
