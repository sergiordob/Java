import java.util.Scanner;

public class Exercise514
{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int integerMaxValue = Integer.MAX_VALUE;
        int firstInteger = 0;
        int secondInteger = 0;
        int firstDivisor = 0;
        int secondDivisor = 0;

        System.out.print("Enter the first integer: ");
        firstInteger = input.nextInt();
        System.out.print("Enter the second integer: ");
        secondInteger = input.nextInt();

        firstDivisor = firstInteger;
        secondDivisor = secondInteger;

        for (int i = firstDivisor; i > 0 && secondDivisor > 0; i--, secondDivisor--)
        {
            if (firstInteger % i == 0) //divide o inteiro por ele mesmo e seus decrementos. Se o resto for zero, ele eh divisivel
            {

            }
        }

    }
}
