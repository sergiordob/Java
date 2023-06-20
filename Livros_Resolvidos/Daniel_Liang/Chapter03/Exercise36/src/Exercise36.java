import java.util.Scanner;

public class Exercise36
{
    public static void main(String[] args)
    {//Esse exercicio foi adaptado para o sistema de grandezas SI, usado no Brasil.
        Scanner input = new Scanner(System.in);
        IMC imc = new IMC();

        double weight, meters, centimeters;

        System.out.print("Enter the weight: ");
        weight = input.nextDouble();
        System.out.print("Enter the meters: ");
        meters = input.nextDouble();
        System.out.print("Enter the centimeters: ");
        centimeters = input.nextDouble();

        System.out.printf("IMC = %.2f%nGrade: %s", imc.getIMC(weight,meters,centimeters), imc.getGrade(weight,meters,centimeters));
    }
}
