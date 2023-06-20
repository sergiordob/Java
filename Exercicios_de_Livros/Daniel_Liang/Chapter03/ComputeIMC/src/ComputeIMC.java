import java.util.Scanner;

public class ComputeIMC
{
    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        IMC imc = new IMC();

        System.out.print("Enter the weight: ");
        double weight = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        imc.getIMC(weight, height);
    }
}
