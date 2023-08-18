import java.util.Scanner;

public class Exercise_7_5
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int flag = 0;
        int odd = 0;
        int even = 0;

        for(int i = 0; i < 10; i++)
        {
            System.out.printf("Enter the number %d: ", i);
            flag = input.nextInt();

            if (flag == 0)
            {
                break;
            }
            else
            {
                numbers[i] = flag;

                    if (numbers[i] % 2 == 0)
                    {
                        even++;
                    }
                    else if (numbers[i] % 2 != 0)
                    {
                        odd++;
                    }
            }
        }
        System.out.printf("Even = %d   Odd = %d", even, odd);
    }
}
