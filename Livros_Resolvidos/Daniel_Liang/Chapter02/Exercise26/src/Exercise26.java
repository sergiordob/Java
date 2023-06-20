import java.util.Scanner;

public class Exercise26
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CustomSum modifier = new CustomSum();

        int number;

        System.out.print("Enter a integer between 0 to 1000: ");
        number = input.nextInt();

        System.out.printf("Sum of the digits: %d", modifier.getSum(number));
    }
}
