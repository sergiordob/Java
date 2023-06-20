import java.util.Scanner;

public class Exercise25
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calculus modifier = new Calculus();

        double gratuity_rate, subtotal;

        System.out.print("Enter the subtotal: ");
        subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        gratuity_rate = input.nextDouble();

        System.out.printf("Gratuity = %.3f%nTotal = %.3f", modifier.getGratuity(subtotal, gratuity_rate), modifier.getTotal(subtotal,gratuity_rate));
    }
}
