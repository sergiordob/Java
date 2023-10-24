import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Date;

public class Exercise_11_06 {
    public static void main (String[] args){

        ArrayList<Object> arrayList = new ArrayList<>();

        Loan loan = new Loan();
        Circle circle = new Circle();
        String string = "Test";

        arrayList.add(loan);
        arrayList.add(circle);
        arrayList.add(string);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println((arrayList.get(i)).toString());
        }
    }
}
