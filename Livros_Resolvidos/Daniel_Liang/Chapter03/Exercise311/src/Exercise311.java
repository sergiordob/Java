import java.util.Scanner;

public class Exercise311
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Date date = new Date();

        System.out.print("Enter 1-12 for a month: ");
        int month = input.nextInt();
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.printf("%s %d has %d days", date.getMonth(month), date.getYear(year), date.getDays(month,year));
    }
}
