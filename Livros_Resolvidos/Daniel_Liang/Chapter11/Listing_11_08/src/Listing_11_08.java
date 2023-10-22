import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class Listing_11_08 {
    public static void main (String[] args){
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("Natal");
        cityList.add("Recife");
        cityList.add("Joao Pessoa");
        cityList.add("Aracaju");
        cityList.add("Salvador");
        cityList.add("Fortaleza");
        cityList.add("Maceio");

        System.out.println("List size: " + cityList.size());
        System.out.println("Is Salvador in the list? " + cityList.contains("Salvador"));
        System.out.println("Location of Natal in the list? " + cityList.indexOf("Natal"));

        cityList.add(2, "Sao Paulo");
        cityList.remove("Fortaleza");
        cityList.remove(4);
        System.out.println(cityList.toString());

        for(int i = cityList.size() - 1; i >= 0; i--){
            System.out.println("City " + i + ": " + cityList.get(i));
        }
    }
}
