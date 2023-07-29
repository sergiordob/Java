import java.util.Scanner;

public class Exercise_6_17
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int order;
        int i;
        int j;

        System.out.print("Enter the order of the matix: ");
        order = input.nextInt();

        printMatrix(order);
    }
    public static void printMatrix(int order)
    {
        for (int i = 0; i < order; i++)
        {
            for (int j = 0; j < order; j++)
            {
                System.out.printf("%d ", (int) Math.random() * 2);
            }
            System.out.println();
        }
    }
}
