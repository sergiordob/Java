import java.util.Scanner;

public class Exercise38
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Order order = new Order();

        int a,b,c;

        System.out.print("Enter three integers numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        order.getOrder(a,b,c);
    }
}
