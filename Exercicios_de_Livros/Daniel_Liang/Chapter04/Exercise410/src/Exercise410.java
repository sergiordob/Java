import java.util.Scanner;

public class Exercise410
{
    public static void main(String[] args)
    {
        String set1 = " 1 3 5 7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";
        //String set1 = new String(" 1 3 5 7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31");
        String set2 = " 2 3 6 7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";
        String set3 = " 4 5 6 7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";
        String set4 = " 8 9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";
        String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";

        Scanner input = new Scanner(System.in);

        int day = 0;
        char answer;

        System.out.println(set1);
        System.out.print("Is your birthday in Set1? (Y/N): ");
        answer = input.next().charAt(0);

        if (answer == 'Y' || answer == 'y')
        {
            day += 1;
        }

        System.out.println(set2);
        System.out.print("Is your birthday in Set2? (Yes/No -> 1/0): ");
        answer = input.next().charAt(0); //next() eh um metodo da classe scanner e charAt() eh um metodo da classe string

        /*No código answer = input.next().charAt(0);, o objeto input da classe Scanner está chamando o método next(), que retorna uma sequência de caracteres
        como uma instância da classe String. Em seguida, é chamado o método charAt(0) na instância da classe String retornada por next(). Esse método charAt(0)
        retorna o primeiro caractere da sequência de caracteres.
        Dessa forma, o objeto input da classe Scanner está chamando o método next() para obter uma sequência de caracteres e, em seguida, o método charAt(0) é chamado
        nessa sequência de caracteres retornada, que é uma instância da classe String. O resultado desse charAt(0) é atribuído à variável answer, que é do tipo char.*/

        if (answer == 'Y' || answer == 'y')
        {
            day += 2;
        }

        System.out.println(set3);
        System.out.print("Is your birthday in Set3? (Yes/No -> 1/0): ");
        answer = input.next().charAt(0);

        if (answer == 'Y' || answer == 'y')
        {
            day += 4;
        }

        System.out.println(set4);
        System.out.print("Is your birthday in Set4? (Yes/No -> 1/0): ");
        answer = input.next().charAt(0);

        if (answer == 'Y' || answer == 'y')
        {
            day += 8;
        }

        System.out.println(set5);
        System.out.print("Is your birthday in Set5? (Yes/No -> 1/0): ");
        answer = input.next().charAt(0);

        if (answer == 'Y' || answer == 'y')
        {
            day += 16;
        }

        System.out.printf("Your birthday: %d", day);
    }
}
