public class Exercise56
{
    public static void main (String[] args)
    {
        int i = 10, j = 30;
        double squareMeter = 0.0;
        double ping = 0.0;

        System.out.println("Ping     Square meter   |   Square meter     Celsius");

        for (i = 10, j = 30; i <= 80 && j <= 100; i+=5, j+=5)
        {
            System.out.printf("%-8d     %.3f    |   %-12d   %.3f%n",i, i*3.305, j,  j*3.305);
        }
    }
}
