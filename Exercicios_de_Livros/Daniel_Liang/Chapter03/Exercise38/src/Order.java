public class Order
{
    public static void getOrder(int a, int b, int c)
    {
        int highest = 0;
        int middle = 0;
        int lowest = 0;

        if (a > b && a > c)
        {//Possibilidades: a b c,a c b,b a c,b c a,c a b,c b a
            highest = a;

            if (b > c)
            {
                middle = b;
                lowest = c;
            }
            else
            {
                middle = c;
                lowest = b;
            }
        }
        else if (b > a && b > c)
        {
            highest = b;

            if (a > c)
            {
                middle = a;
                lowest = c;
            }
            else
            {
                middle = c;
                lowest = a;
            }
        }
        else if (c > a && c > b)
        {
            highest = c;

            if (a > b)
            {
                middle = a;
                lowest = b;
            }
            else
            {
                middle = b;
                lowest = a;
            }
        }
    System.out.printf("%d %d %d", lowest, middle, highest);
    }
}
