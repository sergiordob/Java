public class Exercise543
{
    public static void main (String[] args)
    {
        int i;
        int j;
        int cont = 0;

        for (i = 1; i <= 7; i++)
        {
            for (j = 1; j <= 7; j++)
            {
                if (j > i)
                {
                    System.out.printf("%d %d%n", i, j);
                    cont++;
                }
            }
        }
        System.out.printf("%nThe total number of all combinations is %d", cont);
    }
}
