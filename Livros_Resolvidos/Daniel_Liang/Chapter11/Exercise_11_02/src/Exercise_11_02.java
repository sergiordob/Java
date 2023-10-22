import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_11_02 {
    public static void main (String[] args){
        // Create a Person, Student, Employee, Faculty, and Staff objects
        Person person = new Person("John", "12 Bell street",
                "3473339999", "john12@aol.com");

        Student student = new Student(1, "Mary", "100 Town Ave",
                "5149993333", "mary100@aol.com");

        Employee employee = new Employee("Mike", "34 West street", "6189999999",
                "mike80@aol.com", "910", "60000", "11/05/1988");

        Faculty faculty = new Faculty("Sue", "28 Well street", "4133333333",
                "sue28@aol.com", "101", "50000", "11/05/1988", "4pm to 6pm", "A");

        Staff staff = new Staff("Tom", "90 Country road", "2030000000",
                "tomcat@aol.com", "12", "65000", "11/05/1988", "Executive Assistant");

        // Invoke toString of Person, Student, Employee, Faculty and Staff
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
