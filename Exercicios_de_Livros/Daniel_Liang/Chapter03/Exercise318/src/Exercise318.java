import java.util.Scanner;

public class Exercise318
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double weight;
        double cost = 0.0;

        System.out.print("Enter the weight: ");
        weight = input.nextDouble();

        if (weight > 0 && weight <= 1)
        {
            cost = 3.5;
        }
        else if (weight > 1 && weight <= 3)
        {
            cost = 5.5;
        }
        else if (weight > 3 && weight <= 10)
        {
            cost = 8.5;
        }
        else if (weight > 10 && weight <= 10)
        {
            cost = 10.5;
        }

        System.out.printf("Cost = %.2f", cost);
    }
}
