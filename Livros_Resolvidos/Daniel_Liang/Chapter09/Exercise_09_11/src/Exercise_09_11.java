import java.util.Scanner;
import java.util. Locale;
import br.com.classes.*;

public class Exercise_09_11 {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double[] coefficients = new double[6];
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f'}; //2, 3, 8, 4, 5, 18 -> sistema possivel

        for(int i = 0; i < 6; i++){
           System.out.printf("Enter %c: ", letters[i]);
           coefficients[i] = input.nextDouble();
       }

        LinearEquation linearEquation = new LinearEquation(coefficients[0], coefficients[1], coefficients[2], coefficients[3], coefficients[4], coefficients[5]);

        if (linearEquation.isSolvable() == true){
            System.out.printf("X = %.2f%n", linearEquation.getX());
            System.out.printf("Y = %.2f%n", linearEquation.getY());
        }
        else{
            System.out.println("The system has no solution.");
        }
    }
}
