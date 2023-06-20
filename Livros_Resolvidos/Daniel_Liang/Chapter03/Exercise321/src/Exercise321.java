import java.util.Scanner;

public class Exercise321
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int year = 0, monthNumber = 0, dayOfTheMonth = 0;

        System.out.print("Enter a year: ");
        year = input.nextInt();
        System.out.print("Enter the month (1-12): ");
        monthNumber = input.nextInt();
        System.out.print("Enter the day of the month: ");
        dayOfTheMonth = input.nextInt();

        int j = year/100;
        int k = year%100;
        int dayOfTheWeek;
        String printDay = "Null";

        if (monthNumber < 3)
        {
            switch (monthNumber)
            {
                case 1: monthNumber = 13; break;
                case 2: monthNumber = 14; break;
                default: break;
            }
            year--;
        }

        int first = dayOfTheMonth;
        int second = (26/10)*(monthNumber+1); //o problema esta aqui, na forma que a equacao deve ser montada
        int third = k;
        int fourth = k/4;
        int fifth = j/4;
        int sixth = 5*j;

        dayOfTheWeek = (first + second + third + fourth + fifth + sixth )%7;

        switch (dayOfTheWeek)
        {
            case 0: printDay = "Saturday"; break;
            case 1: printDay = "Sunday"; break;
            case 2: printDay = "Monday"; break;
            case 3: printDay = "Tuesday"; break;
            case 4: printDay = "Wednesday"; break;
            case 5: printDay = "Thursday"; break;
            case 6: printDay = "Friday"; break;
            default: printDay = "Error"; break;
        }
        System.out.printf("Primeiro = %d  Segundo = %d  Terceiro = %d  Quarto = %d  Quinto = %d  Sexto = %d  Dia = %s", first, second, third, fourth, fifth, sixth, printDay);
        //System.out.printf("%s", printDay);
    }
}
