import java.util.Scanner;

public class Exercise210 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calculus heat = new Calculus();

        double amount__of_water, initial_temperature, final_temperature;

        System.out.print("Enter the amount of water in kg: ");
        amount__of_water = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        initial_temperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        final_temperature = input.nextDouble();
        System.out.printf("The energy needed is: %.3f", heat.getEnergy(amount__of_water, initial_temperature, final_temperature));
    }
}