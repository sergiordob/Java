import java.util.Scanner;

public class Exercise312
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();

        int number;

        System.out.print("Enter a three-digit integer: ");
        number = input.nextInt();

        System.out.print("Palindrome: " + palindrome.getCheck(number));
    }
}
