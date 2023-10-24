import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_11_05{
    public static void main (String[] args){
        Course course = new Course("Java", 5);
        course.addStudent("Joao");
        course.addStudent("Pedro");
        course.addStudent("Paulo");
        course.addStudent("Mateus");
        course.addStudent("Tiago");
        //System.out.printf("%d", course.getNumberOfStudents());
        course.getArrayList();
    }
}
