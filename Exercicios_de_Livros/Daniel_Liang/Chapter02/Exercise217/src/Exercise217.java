import java.util.Scanner;

public class Exercise217
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Index index = new 2Index();

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double wind_speed = input.nextDouble();

        System.out.printf("The wind chill index is %.3f", index.getWindChill(temperature, wind_speed));
    }
}
