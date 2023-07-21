public class Exercise527
{
    public static void main (String[] args)
    {
        int year = 2014;
        int cont = 0;

        while (year <= 2114)
        {
            if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )
            {
                cont++;

                System.out.printf("%d ", year);

                    if (cont % 10 == 0)
                    {
                        System.out.println();
                    }

            }
            year++;
        }
    }
}
