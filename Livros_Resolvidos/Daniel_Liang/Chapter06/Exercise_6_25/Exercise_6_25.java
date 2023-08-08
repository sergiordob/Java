import java.util.Scanner;

public class Exercise_6_25
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        long milis;

        System.out.print("Enter the time in miliseconds: ");
        milis = input.nextLong();
        System.out.printf("Time = %s", convertMilis(milis));
    }

    public static String convertMilis(long milis)
    {
        long totalSeconds = milis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;

        String realTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        return realTime;
    }
}
