public class Exercise510
{
    public static void main (String[] args)
    {
        int cont = 0;

        for (int i = 100; i <= 1000; i++)
        {
            if (i % 3 == 0 && i % 4 == 0)
            {
                System.out.printf("%d ", i);
                cont++;

                    if (cont % 10 == 0)
                    {
                        System.out.println();
                    }
            }
        }
    }
}
