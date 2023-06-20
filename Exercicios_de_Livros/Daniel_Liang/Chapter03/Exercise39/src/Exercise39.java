import java.util.Scanner;

public class Exercise39
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Checksum checksum = new Checksum();

        int first_nine_digits;

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        first_nine_digits = input.nextInt();
        checksum.getChecksum(first_nine_digits);
    }
}
