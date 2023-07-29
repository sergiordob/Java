import java.util.Scanner;

public class Exercise_6_5
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("Enter the first double number: ");
        num1 = input.nextDouble();
        System.out.print("Enter the second double number: ");
        num2 = input.nextDouble();
        System.out.print("Enter the third double number: ");
        num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers (double num1, double num2, double num3)
    {
        double temp; // Hold number to swap

        if (num2 < num1 && num2 < num3){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        // Display result
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}

