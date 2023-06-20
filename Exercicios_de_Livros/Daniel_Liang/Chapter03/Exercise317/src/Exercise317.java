import java.util.Scanner;
import java.util.Random;

public class Exercise317
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int chosen;
        int pc = random.nextInt(3); //gera numeros 0,1,2

        System.out.print("Enter [0] - Scissor or [1] - Rock or [2] Paper: ");
        chosen = input.nextInt();

        if (chosen == 0) //tesoura: ganha de papel, perde para pedra, empata com tesoura
        {
            if (pc == 0)
            {
                System.out.print("Draw");
            }
            else if (pc == 1)
            {
                System.out.print("Fail");
            }
            else if (pc  == 2)
            {
                System.out.print("Win!");
            }
        }
        else if (chosen == 1) //pedra: ganha tesoura, perde papel, empata pedra
        {
            if (pc == 0)
            {
                System.out.print("Win");
            }
            else if (pc == 1)
            {
                System.out.print("Draw");
            }
            else if (pc == 2)
            {
                System.out.print("Lost");
            }
        }
        else if (chosen == 2) //papel: ganha pedra, perde tesoura, empata papel
        {
            if (pc == 0)
            {
                System.out.print("Lost");
            }
            else if (pc == 1)
            {
                System.out.print("Win");
            }
            else if (pc == 2)
            {
                System.out.print("Draw");
            }
        }
    }
}
