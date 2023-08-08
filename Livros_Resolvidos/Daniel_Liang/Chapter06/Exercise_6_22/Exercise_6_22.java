import java.util.Scanner;

public class Exercise_6_22
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double value;
        int iteration;

        System.out.print("Enter a double value: ");
        value = input.nextDouble();
        System.out.printf("Square root of %.2f = %.1f", value, getSqrt(value));
    }
    public static double getSqrt(double value)
    {
        double lastGuess = 1.0;
        double nextGuess = ((lastGuess + value) / lastGuess) / 2;
        double tolerance = 1e-8; // 0.0000001: Valor de tolerância para parar o cálculo

        while (Math.abs(nextGuess - lastGuess) > tolerance) //Se a diferenca entre a aposta e o valor interior for > tolerancia
        {
            lastGuess = nextGuess;
            nextGuess = ((lastGuess + value) / lastGuess) / 2;
        }

        return nextGuess;
    }
}
