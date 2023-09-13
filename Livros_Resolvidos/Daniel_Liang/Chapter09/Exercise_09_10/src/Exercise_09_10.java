import java.util.Scanner;
import java.util.Locale;
import br.com.classes.*;

public class Exercise_09_10 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        QuadraticEquation equation = new QuadraticEquation(5.0,5.0,1.0);

        if (equation.getDiscriminant() > 0){
            System.out.printf("Root 1 = %.2f%n", equation.getRootOne());
            System.out.printf("Root 2 = %.2f%n", equation.getRootTwo());
        }
        else if (equation.getDiscriminant() < 0){
            System.out.println("The equation has no roots.");
        }
        else{
            System.out.printf(" Root 1 = Root 2 = %.2f", equation.getRootOne());
        }
    }
}
