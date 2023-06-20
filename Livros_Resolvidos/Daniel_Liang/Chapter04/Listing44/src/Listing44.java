import java.util.Scanner;

public class Listing44
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String string = new String();

        char charPosition;
        char charUpperCase;
        int value;

        System.out.print("Enter a hex digit: ");
        string = input.nextLine();

        while (string.length() != 1) //esse metodo informa o comprimento numerico da string
        {
            System.out.print("\n\nYou must enter one char");
            System.out.print("Enter a hex digit: ");
            string = input.nextLine();
        }

        charPosition = string.charAt(0);                        //Toda essa logica e o uso da classe Character eh necessaria pois o if abaixo nao suporta uma string de unico carcartere
        charUpperCase = Character.toUpperCase(charPosition);

        if (charUpperCase >= 'A' && charUpperCase  <= 'F')  //Aqui ele traduz de hexa A-F em decimal
        {
            value = charUpperCase - 'A' + 10;
            System.out.printf("Decimal value = %d", value);
            //System.out.print("Aqui");
        }

        else if ( Character.isDigit(charUpperCase)) //Aqui ele imprime um numero de 0-9, caso o charUpperCase esteja dentro dessa faixa
        {
            System.out.print("Decimal value " + charUpperCase);
        }
        else
        {
            System.out.println(charUpperCase + " is an invalid input"); //Aqui ele printa se o caractere eh invalido, isto e, fora da faixa de 0-F
        }
    }
}
