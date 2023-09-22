import br.com.classes.*;
import java.util.Scanner;
import java.util.Locale;

public class NTU_POO_01 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Circle circleOne = new Circle(2.0);

        System.out.printf("Color: %s%n", circleOne.getColor());
        System.out.printf("Area: %.2f", circleOne.getArea());
    }
}
