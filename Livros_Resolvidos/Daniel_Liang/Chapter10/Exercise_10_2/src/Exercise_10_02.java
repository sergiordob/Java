package br.com.classes;
import java.util.Scanner;
import java.util.Locale;

public class Exercise_10_02 {
    public static void main (String[] args){
        BMI bmi = new BMI();

        bmi.setWeight(120);
        bmi.setHeight(1.80);

        System.out.printf("BMI: %.2f%n", bmi.getBMI());
        System.out.printf("Status: %s", bmi.getStatus());
    }
}
