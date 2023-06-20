import java.util.Scanner;

public class Exercise214
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        Imc imc = new Imc();

        double weight, height;

        System.out.print("Enter weights in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter the height in inches: ");
        height = input.nextDouble();

        System.out.printf("IMC = %.2f", imc.getIMC(weight, height));
    }
}
