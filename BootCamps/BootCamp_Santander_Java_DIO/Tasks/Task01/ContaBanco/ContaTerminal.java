import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        double saldo = 0.0;
        String agencia = "";
        String nomeDoCliente = "";

        System.out.print("Digite o nome do cliente: ");
        nomeDoCliente = entrada.nextLine();
        System.out.print("Digite o numero da Agencia: ");
        agencia = entrada.nextLine();
        System.out.print("Digite o numero da Conta: ");
        numero = entrada.nextInt();
        System.out.print("Digite o valor para deposito: ");
        saldo = entrada.nextDouble();
        System.out.printf("%n%nOla %s, obrigado por criar uma conta em nosso banco, sua agencia eh %s, conta %d e seu saldo %.2f ja esta disponivel para saque.", nomeDoCliente, agencia, numero, saldo);
    }
}


