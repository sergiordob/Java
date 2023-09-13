import br.com.classes.*;
import java.util.Scanner;
import java.util.Locale;


public class Exercise_09_07
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        //Account account = new Account(1122,20000.0);
        Account account = new Account();

        account.setId(1122);
        account.setBalance(20000.0);

        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.printf("Balance = %.2f", account.getBalance());
        System.out.printf("%nMonthly Interest Rate = %.2f", account.getMonthlyInterest());
        System.out.printf("%nDate created: %s", account.getDateCreated());

    }
}
