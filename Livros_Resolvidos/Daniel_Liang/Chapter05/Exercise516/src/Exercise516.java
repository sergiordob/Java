import java.util.Scanner;

public class Exercise516
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int integer;

        System.out.print("Enter a integer: ");
        integer = input.nextInt();

        //int i = 2;
        for (int i = 2; i <= integer; i++)
        {
            while (integer % i == 0)
            {
                System.out.println(i);
                integer = integer / i;
                /* Aqui esta o nucleo do codigo: Se o resto da divisao eh zero, o dividendo continua sendo dividido por i. Se o resto for diferente de zero, o valor de i se atualiza.
                Por exemplo: vamos supor que o inteiro seja igual a 12. Assim, 12 % 2 = 0 (resto zero), entao inteiro = 12/2 = 6. Em algum momento integer % 2 != 0, dai
                o valor de i sera incrementado, e assim novas verificacoes ocorrerao
                12| 2 (integer = 12 e i = 2)
                 6| 2 (integer = 6  e i = 2)
                 3| 3 (integer = 3  e i = 3)
                 1|
                 */

            }
        }
    }
}
