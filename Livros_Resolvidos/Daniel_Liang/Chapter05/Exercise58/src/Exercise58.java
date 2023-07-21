import java.util.Scanner;
import java.util.Locale;

public class Exercise58
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int numberOfStudents = 0;
        double studentsScore = 0.0;
        double higherScore = 0.0;
        String studentsName = null;
        String higherScoreName = null;

        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        for (int i = 1; i <= numberOfStudents; i++)
        {
            System.out.printf("Enter the name of student number %d: ", i);
            studentsName = input.next();
            System.out.printf("Enter the score of the student number %d: ", i);
            studentsScore = input.nextDouble();

                if (studentsScore > higherScore)
                {
                    higherScore = studentsScore;
                    higherScoreName = studentsName;
                }
        }
        System.out.printf("%s has the higher score: %.2f", higherScoreName, higherScore);
    }
}
