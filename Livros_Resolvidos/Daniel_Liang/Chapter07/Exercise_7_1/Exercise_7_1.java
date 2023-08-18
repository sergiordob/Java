import java.util.Scanner;
import java.util.Locale;

public class Exercise_7_1
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int numberOfStudents = 0;
        double[] score;
        char[] grade;

        System.out.print("Enter the number os students: ");
        numberOfStudents = input.nextInt();
        score = new double[numberOfStudents];
        grade = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++)
        {
            System.out.printf("Enter the student number %d score: ", i);
            score[i] = input.nextDouble();
        }

        getGrade(score, grade);

        for (int i = 0; i < numberOfStudents; i++)
        {
            System.out.printf("%nGrade of the student %d: %c", i, grade[i]);
        }

    }

    public static double getMax(double[] score)
    {
        double maxValue = 0.0;

        for (int i = 0; i < score.length; i++)
        {
            maxValue = (score[i] > maxValue) ? score[i] : maxValue;
        }
        return maxValue;
    }

    public static void getGrade(double[] score, char[] grade)
    {
        double maxScoreValue = getMax(score);

        for (int i = 0; i < score.length; i++)
        {
            if (score[i] >=  maxScoreValue - 5)
            {
                grade[i] = 'A';
            }
            else if (score[i] >=  maxScoreValue - 10)
            {
                grade[i] = 'B';
            }
            else if (score[i] >=  maxScoreValue - 15)
            {
                grade[i] = 'C';
            }
            else if (score[i] >=  maxScoreValue - 20)
            {
                grade[i] = 'D';
            }
            else
            {
                grade[i] = 'F';
            }
        }
    }
}

