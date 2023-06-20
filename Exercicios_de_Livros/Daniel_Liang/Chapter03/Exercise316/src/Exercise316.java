import java.util.Scanner;
import java.util.Random;

public class Exercise316
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int x1 = random.nextInt(101); //0 ate 100
        int y1 = random.nextInt(201); //0 ate 200

        System.out.print("Random coordinate generated: " + x1 + "," + y1);

    }
}
