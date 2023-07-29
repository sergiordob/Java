import java.util.Scanner;

public class Exercise_6_18
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String password = "";

        System.out.print("Enter a password: ");
        password = input.nextLine();

        System.out.printf("Rule One? %b%n", isRuleOneValid(password));
        System.out.printf("Rule Two? %b%n", isRuleTwoValid(password));
        System.out.printf("Rule Three? %b%n", isRuleThreeValid(password));
        System.out.printf("Password valid? %b", isPasswordValid(password));

    }
    public static boolean isRuleOneValid(String password)
    {
        if (password.length() >= 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isRuleTwoValid(String password)
    {
        boolean isValid = true; // Inicialmente, consideramos a senha como válida

        for (int i = 0; i < password.length(); i++)
        {
            char character = password.charAt(i);

            if (!(Character.isLetter(character) || Character.isDigit(character))) //Se o Caractere nao for nem letra, nem numero
            {
                isValid = false; // Se encontrar um caractere que não seja letra ou dígito, a senha é inválida
                break; // Saímos do loop, pois já sabemos que a senha é inválida
            }
        }
        return isValid; // Retorna true se não encontrou caracteres inválidos, caso contrário, retorna false
    }

    public static boolean isRuleThreeValid(String password)
    {
        int count = 0;

        for(int i = 0; i < password.length(); i++)
        {
            char character = password.charAt(i);

            if (Character.isDigit(character))
            {
                count++;
            }
        }
        if (count >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isPasswordValid(String password)
    {
        return isRuleOneValid(password) && isRuleTwoValid(password) && isRuleThreeValid(password);
    }
}

