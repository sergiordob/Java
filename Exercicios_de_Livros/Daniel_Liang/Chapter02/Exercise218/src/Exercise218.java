import java.util.Scanner;

public class Exercise218
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double i, j, k;

        for (i = 1,j = 2; i <= 5 && j <= 6; i++, j++ )
        {
            k = Math.pow(i,j);
            System.out.printf("%.1f * %.1f = %.1f%n", i, j, k);
        }
    }
}
