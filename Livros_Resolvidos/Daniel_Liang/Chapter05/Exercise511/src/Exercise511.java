public class Exercise511
{
    static public void main (String[] args)
    {
        int cont = 0;

        for (int i = 100; i <= 200; i++)
        {
            if (i % 3 == 0 || i % 4 == 0)
            {
                cont++;
                System.out.printf("%d ", i);

                    if (cont % 10 == 0)
                    {
                        System.out.println();
                    }
            }
        }
    }
}
