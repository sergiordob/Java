import java.util.Scanner;
import java.util.Random;

public class Exercise34
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Month month = new Month();

        int number = random.nextInt(12) + 1; //No random, ele gera de 0 ate 11, e no final soma 1, gerando 1 ate 12

        System.out.print("Month: " + month.getMonth(number));
    }
}
