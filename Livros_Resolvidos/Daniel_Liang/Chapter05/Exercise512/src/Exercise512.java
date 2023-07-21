public class Exercise512
{
    static public void main (String[] args)
    {
        int maxValue = Integer.MAX_VALUE;
        int n = 0;

        while (n < maxValue )
        {
                if (n * n> 12000)
                {
                    System.out.printf("Value of n: %d", n);
                    break;
                }
            n++;
        }
    }
}
