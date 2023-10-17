import java.util.Scanner;
import java.util.Locale;

public class Exercise_10_06_edited {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);

        Factorial factorial = new Factorial();

        int[] array = factorial.returnArray();

        for (int i = 0, j = 8; i <= 7 && j >= 1; i++, j--){
            System.out.printf("Factorial %d = %d%n",j, array[i]);
        }
    }
}
