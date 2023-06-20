import java.util.Scanner;

public class Exercise216
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Hexagon hexagon = new Hexagon();

        double length;

        System.out.print("Enter the length of the side: ");
        length = input.nextDouble();

        System.out.printf("The area of the hexagon is %.4f", hexagon.getArea(length));
    }
}
