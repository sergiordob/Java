import java.util.Scanner;
import java.util.Locale;

public class Exercise_11_03 {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        //Account account = new Account(01, 1000);
        CheckingAccount checkingAccount = new CheckingAccount(01, 1000, -20);

        System.out.print("Enter the money to be withdrawn: ");
        double withdrawn;
        withdrawn = scanner.nextDouble();
        checkingAccount.checkBalance(withdrawn);


    }
}
