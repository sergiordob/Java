import java.util.Scanner;

public class Exercise220
{
    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double balance, interest_rate, interest;

        System.out.print("Enter balance and interest rate: ");
        balance = input.nextDouble();
        interest_rate = input.nextDouble();
        interest = balance*(interest_rate/1200);
        System.out.printf("The interest is %.3f", interest);
    }
}
