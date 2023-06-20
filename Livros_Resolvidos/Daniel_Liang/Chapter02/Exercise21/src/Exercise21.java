import java.util.Scanner;

public class Exercise21
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        CelsiusToFarenheit temperature = new CelsiusToFarenheit();

        double Celsius;

        System.out.print("Enter a degree in Celsius: ");
        Celsius = input.nextDouble();

        System.out.printf("The respective Fahrenheit temperature: %.3f", temperature.getFarenheit(Celsius));
    }
}
