import java.util.Scanner;

public class Exercise529
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int year;
        int day;
        String stringDay = " ";

        System.out.print("Enter the year: ");
        year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        day = input.nextInt();

        for (int month = 1; month <= 12; month++)
        {
            switch (month)
            {
                case 1:
                    System.out.printf("               January %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 2:
                    System.out.println("\n");
                    System.out.printf("               February %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 3:
                    System.out.println("\n");
                    System.out.printf("               March %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 4:
                    System.out.println("\n");
                    System.out.printf("               April %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 5:
                    System.out.println("\n");
                    System.out.printf("               May %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 6:
                    System.out.println("\n");
                    System.out.printf("               June %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 7:
                    System.out.println("\n");
                    System.out.printf("               July %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 8:
                    System.out.println("\n");
                    System.out.printf("               August %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 9:
                    System.out.println("\n");
                    System.out.printf("               September %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 10:
                    System.out.println("\n");
                    System.out.printf("               October %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 11:
                    System.out.println("\n");
                    System.out.printf("               November %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                case 12:
                    System.out.println("\n");
                    System.out.printf("               December %d%n", year);
                    System.out.println("___________________________________________________");
                    System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
                break;

                default: break;
            }


        }
    }
}
