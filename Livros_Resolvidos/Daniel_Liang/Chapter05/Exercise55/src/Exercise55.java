public class Exercise55
{
    public static void main (String[] args)
    {
        int i = 0, j = 20;
        double fahrenheit = i * 9/5 + 32;
        double celsius = (5 * j - 160) / 9;


        System.out.println("Celsius     Fahrenheit   |   Fahrenheit     Celsius");

        for (i = 0, j = 20; i <= 100 && j <= 270; i+=2, j+=5)
        {
            System.out.printf("%-10d    %.2f      |   %-12d   %.2f%n",i, fahrenheit, j,  celsius);
        }
    }
}
