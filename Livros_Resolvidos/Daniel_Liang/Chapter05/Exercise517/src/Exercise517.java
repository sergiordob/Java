import java.util.Scanner;

public class Exercise517
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;
        int up;
        int down;

        System.out.print("Enter a integer between 1 to 15: ");
        number = input.nextInt();

        up = number;
        down = number;

        for (int line = 1; line <= 7; line++) //Pular linhas
        {
            for (int i = down; i >= 1; i--) //Parte decrescente
            {
                System.out.printf("%d ", i);
            }
            down--;

            for (int i = 2; i <= up; i++) //Parte crescente
            {
                System.out.printf("%d ", i);
            }
            up--;

            System.out.println();
        }
    }
}
