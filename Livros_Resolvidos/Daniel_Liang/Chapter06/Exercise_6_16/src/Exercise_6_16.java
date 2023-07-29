public class Exercise_6_16
{
    public static void main (String[] args)
    {
        for (int year = 2014; year <= 2034; year++)
        {
            System.out.printf("%d has %d days%n", year, getDaysInAYear(year));
        }
    }

    public static  int getDaysInAYear(int year)
    {
        int amountOfDays;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            amountOfDays = 366;
        }
        else
        {
            amountOfDays = 365;
        }

        return amountOfDays;
    }
}
