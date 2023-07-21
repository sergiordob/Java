import java.util.Scanner;

public class Exercise518c
{
    public static void main (String[] args)
    {
        for (int i = 6; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(" ");
            }

            for (int k = 6; k >= i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
