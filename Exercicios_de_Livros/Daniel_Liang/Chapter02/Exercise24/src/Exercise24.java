import java.util.Scanner;

public class Exercise24
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Conversion modifier = new Conversion();

        double pounds;

        System.out.print("Enter the value in pounds: ");
        pounds = input.nextDouble();

        System.out.printf("The value in kilograms: %.3f", modifier.getKilograms(pounds));
    }
}
