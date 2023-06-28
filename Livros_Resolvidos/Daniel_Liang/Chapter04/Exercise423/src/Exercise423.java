import java.util.Scanner;
import java.util.Locale; //Used in order to the user put "." for double numbers despite using ","

public class Exercise423
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); //Used in order to the user put "." for double numbers despite using ","
        String name = null;

        double numberOfCoffeesBoughtInTotal = 0.0;
        double averageCoffeePrice = 0.0;
        double standardDiscountRate = 0.0;
        double mailinglistMemberDiscountRate = 0.0;


        System.out.print("Enter customer's name: ");
        name = input.nextLine();
        System.out.print("Enter number of coffees bought in total: ");
        numberOfCoffeesBoughtInTotal = input.nextInt();
        System.out.print("Enter average coffee price: ");
        averageCoffeePrice = input.nextInt();
        System.out.print("Enter standard discount rate: ");
        standardDiscountRate = input.nextDouble();
        System.out.print("Enter mailing-list member discount rate: ");
        mailinglistMemberDiscountRate = input.nextDouble();

        double standardDiscount = numberOfCoffeesBoughtInTotal * averageCoffeePrice * 0.15;
        double mailingListMembershipDiscount = numberOfCoffeesBoughtInTotal * averageCoffeePrice * 0.03;
        double totalSaved = standardDiscount + mailingListMembershipDiscount;
        double totalSpendingOnCoffee = numberOfCoffeesBoughtInTotal * averageCoffeePrice;

        System.out.printf("%n%nCustomer's name: %s", name);
        System.out.printf("Coffees bought: %.2f%n", numberOfCoffeesBoughtInTotal);
        System.out.printf("Average coffee price: %.2f%n", averageCoffeePrice);
        System.out.printf("Total Spending on Coffee: %.2f%n", totalSpendingOnCoffee);

        System.out.printf("Discounts: ");
        System.out.printf("%n\t\tStandard discount (15.00%%): %.2f%n", standardDiscount);
        System.out.printf("\t\tMailing list membership discount (3.0%%): %.2f%n", mailingListMembershipDiscount);
        System.out.printf("\t\tTotal Saved): %.2f%n", totalSaved);
        System.out.printf("Total Spending after Discount: %.2f%n", totalSpendingOnCoffee - totalSaved);
    }
}
