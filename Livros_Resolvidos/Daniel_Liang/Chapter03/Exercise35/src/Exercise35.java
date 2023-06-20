import java.util.Scanner;

public class Exercise35
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Day day = new Day();

        int today, elapsed_days;

        System.out.print("Enter today's day: ");
        today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        elapsed_days = input.nextInt();
        System.out.printf("Today is %s  and the future day is %s", day.getToday(today),day.getFutureDay(today, elapsed_days));
    }
}
