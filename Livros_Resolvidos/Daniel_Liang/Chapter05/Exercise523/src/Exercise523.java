import java.util.Scanner;

public class Exercise523
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int i = 0;
        double answer = 0.0;
        int mode = 0;

        System.out.print("Enter 1 (left - right) or 2 (right - left): ");
        mode = input.nextInt();

        switch (mode)
        {
            case 1:
                System.out.print("Enter a value for n: ");
                i = input.nextInt();

                for (int n = 1; n <= i; n++) //from left to right
                {
                    answer += 1.0 / (double) n;
                }
                System.out.printf("Sum = %.10f%n", answer);
                break;

            case 2:
                System.out.print("Enter a value for n: ");
                i = input.nextInt();

                for (int n = i; n >= 1; n--) //from right to left
                {
                    answer += 1.0 / (double) n;
                }
                System.out.printf("Sum = %.10f%n", answer);
                break;

            default: System.out.print("Error"); break;
        }
    }
}
