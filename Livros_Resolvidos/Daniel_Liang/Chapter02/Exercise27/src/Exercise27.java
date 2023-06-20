import java.util.Scanner;

public class Exercise27
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CurrentDays modifierI = new CurrentDays();
        CurrentDayAndYear modifierII = new CurrentDayAndYear();

        long minutes;

        System.out.print("Enter the amount of minutes: ");

        if (minutes < 525600)
        {
            minutes = input.nextLong();
            System.out.printf("Days: %d", modifierI.getTime(minutes));
        }
        else
        {
            minutes = input.nextLong();
            System.out.printf("Days: %d", modifierI.getTime(minutes));
        }
    }
}
