public class Checksum
{
    public static void getChecksum(int first_nine_digits)
    {
        int digit_1 = first_nine_digits / 100000000; // Obtém o primeiro dígito
        int digit_2 = (first_nine_digits / 10000000) % 10; // Obtém o segundo dígito
        int digit_3 = (first_nine_digits / 1000000) % 10; // Obtém o terceiro dígito
        int digit_4 = (first_nine_digits / 100000) % 10; // Obtém o quarto dígito
        int digit_5 = (first_nine_digits / 10000) % 10; // Obtém o quinto dígito
        int digit_6 = (first_nine_digits / 1000) % 10; // Obtém o sexto dígito
        int digit_7 = (first_nine_digits / 100) % 10; // Obtém o sétimo dígito
        int digit_8 = (first_nine_digits / 10) % 10; // Obtém o oitavo dígito
        int digit_9 = first_nine_digits % 10; // Obtém o nono dígito
        
        int digit_10 = ( digit_1 + (digit_2 * 2) + (digit_3 * 3) + (digit_4 * 4) + (digit_5 * 5) + (digit_6 * 6) + (digit_7 * 7) + (digit_8 * 8) + (digit_9 * 9) )%11;

        if (digit_10 == 10)
        {
            char char_digit_10 = 'X';
            System.out.printf("%d %d %d %d %d %d %d %d %d %c", digit_1, digit_2, digit_3, digit_4, digit_5, digit_6, digit_7, digit_8, digit_9, char_digit_10);
        }
        else
        {
            System.out.printf("%d %d %d %d %d %d %d %d %d %d", digit_1, digit_2, digit_3, digit_4, digit_5, digit_6, digit_7, digit_8, digit_9, digit_10);
        }
    }
}
