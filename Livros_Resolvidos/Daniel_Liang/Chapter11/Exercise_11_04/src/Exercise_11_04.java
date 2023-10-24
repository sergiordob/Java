import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class Exercise_11_04 {
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int number = -1;

        do{
            System.out.print("Enter a number (0 to exit): ");
            number = scanner.nextInt();
            if (!list.contains(number) && number != 0) { //se o numero nao eh repetido e se eh diferente de zero
                list.add(number);
            }
        } while (number != 0);

        System.out.printf("Highest value found: %d", isMaximumValue(list));

    }
    public static int isMaximumValue(ArrayList<Integer> list){
        int higher = list.get(0);

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > higher){
                higher = list.get(i);
            }
        }
        return higher;
    }
}
