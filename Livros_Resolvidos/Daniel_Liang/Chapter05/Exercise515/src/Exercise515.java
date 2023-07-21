import java.util.Scanner;

public class Exercise515
{
    public static void main (String[] args)
    {
        int cont = 0;

        for (int i = 33; i <= 126; i++)
        {
            char character = (char) i;
            System.out.printf("%c ", character);
            cont++;

                if (cont % 10 ==0)
                {
                    System.out.println();
                }
        }
    }
}
