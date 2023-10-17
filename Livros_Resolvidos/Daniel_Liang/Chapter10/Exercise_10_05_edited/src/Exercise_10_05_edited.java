import br.com.classes.*;
import java.util.Scanner;
import java.util.Locale;

public class Exercise_10_05_edited {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive integer: ");
        number = scanner.nextInt();

        Display display = new Display(number);

        System.out.printf("Number: %d\n", display.getNumber());
        //System.out.printf("Size: %d\n", display.getSize());

        int[] divisors = display.returnArray();
        System.out.print("Divisors: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }
}
