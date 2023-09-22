import java.util.Scanner;
import java.util.Locale;
import br.com.classes.*;

public class Listening_10_05 {

    public static void main (String[] args){

        Course courseOne = new Course("Data Structure");
        Course courseTwo = new Course("Database");

        courseOne.addStudent("Xandy Aviao");
        courseOne.addStudent("Joao Gomes");
        courseOne.addStudent("Tarcisio do Acordeon");

        courseTwo.addStudent("Rita de Cassia");
        courseTwo.addStudent("Solange Gomes");

        System.out.println("Number of students in course one: " + courseOne.getNumberOfStudents());
        System.out.println("Number of students in course two: " + courseTwo.getNumberOfStudents());

        System.out.println();

        String[] studentsCourseOne = courseOne.getStudents();
        String[] studentsCourseTwo = courseTwo.getStudents();

        for (int i = 0; i < courseOne.getNumberOfStudents(); i ++){
            System.out.println("Student Course One " + i + ": " + studentsCourseOne[i]);
        }

        System.out.println();

        courseOne.dropStudent(studentsCourseOne[0]);

        for (int i = 0; i < courseOne.getNumberOfStudents(); i ++){
            System.out.println("Student Course One " + i + ": " + studentsCourseOne[i]);
        }

        System.out.println();

        for (int i = 0; i < courseTwo.getNumberOfStudents(); i ++){
            System.out.println("Student Course Two " + i + ": " + studentsCourseTwo[i]);
        }

    }
}
