import java.util.Scanner;

public class Exercise_7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[100];
        int number = -1;

        while (number != 0)
        {
            System.out.printf("Enter an integer between 1 and 50 and press 0 to exit: ");
            number = input.nextInt();
            array[number]++; //ocorrencias
        }

        for (int i = 1; i <= 50; i++)
        {
            if (array[i] > 0)
            {
                System.out.printf("%d occurs %d time%s%n", i, array[i], (array[i] > 1) ? "s" : "");
            }
        }
    }
}
