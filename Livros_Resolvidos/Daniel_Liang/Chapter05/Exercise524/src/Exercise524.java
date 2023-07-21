public class Exercise524
{
    public static void main (String[] args)
    {
        int i = 0;
        int j = 0;
        double sum = 0.0;

        for (i = 1, j = 3; i <= 97 && j <= 99; i += 2, j += 2)
        {
            sum += (double) i / (double) j;
            System.out.printf("%.2f/%.2f = %.2f%n", (double) i, (double) j, (double) i / (double) j);
        }
        System.out.printf("Sum = %.2f", sum);
    }
}
