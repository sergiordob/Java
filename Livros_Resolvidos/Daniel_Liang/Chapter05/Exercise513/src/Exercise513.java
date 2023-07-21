public class Exercise513
{
    public static void main (String[] args)
    {
        int integerMaxValue = Integer.MAX_VALUE;
        int n = 0;

            while (n < integerMaxValue)
            {
                    if (n * n > 12000)
                    {
                        System.out.printf("Value of n: %d", n);
                        break;
                    }
                n++;
            }
    }
}
