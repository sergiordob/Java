package br.com.classes;

public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(String students){
        this.students[numberOfStudents] = students;
        numberOfStudents++;
    }

    public void dropStudent(String students){
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].equals(students)) {
                this.students[i] = "";
                //numberOfStudents--;
                break; // Se encontrado, não é necessário continuar procurando
            }
        }
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

}
