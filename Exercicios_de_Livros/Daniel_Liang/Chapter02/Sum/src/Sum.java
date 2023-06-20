import java.util.Scanner;

public class Sum
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        SumOperation sum = new SumOperation();

        int n1, n2, n3;

        System.out.print("Enter number one: ");
        n1 = input.nextInt();
        System.out.print("Enter number two: ");
        n2 = input.nextInt();
        System.out.print("Enter number three: ");
        n3 = input.nextInt();

        System.out.printf("Sum = %d", sum.getSum(n1,n2,n3));
    }
}
