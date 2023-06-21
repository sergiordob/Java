import java.util.Scanner;

public class Exercise417
{
    public static void main (String[] args)
    {
        //In order to simplify this exercise, we are going to suppose that the year is non-leap.
        //If you desire one exercise that implement an algorithm that validate a leap year, search for the previous ones.

        Scanner input = new Scanner(System.in);
        String month = null;

        int year = 0;
        int day = 0;

        System.out.print("Enter a year: ");
        year = input.nextInt();
        System.out.print("Enter a month: ");
        month = input.next();

        switch (month)
        {
            case "Jan": day = 31; break;
            case "Feb": day = 28; break;
            case "Mar": day = 31; break;
            case "Apr": day = 30; break;
            case "May": day = 31; break;
            case "Jun": day = 30; break;
            case "Jul": day = 31; break;
            case "Aug": day = 31; break;
            case "Sep": day = 30; break;
            case "Oct": day = 31; break;
            case "Nov": day = 30; break;
            case "Dec": day = 31; break;
            default: System.out.print("Invalid input."); break;
        }
        System.out.printf("%s %d has %d days", month, year, day);
    }
}
