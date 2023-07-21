import java.util.Scanner;

public class Exercise526
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        int factorial = 1;
        double sum = 0.0;
        int exit = 0;

        System.out.print("Enter a number from 0 to 20: ");
        number = input.nextInt();

            for (int i = number; i >= 1; i--)
            {
                for (int factor = number; factor >= 1; factor--)
                {
                    factorial *= factor;
                }
                sum += 1.0 / factorial;
                number--;
                factorial = 1;
            }
        System.out.printf("e = %.20f", sum+1);
    }
}

