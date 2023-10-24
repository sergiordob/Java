import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> arrayList = new ArrayList<>();
    private int numberOfStudents = 0;

    public Course(){}

    public Course(String courseName, int numberOfStudents){
        this.courseName = courseName;
        this.numberOfStudents = numberOfStudents;
        this.arrayList = arrayList;
    }

    public void addStudent(String student){
        int flag = 0;
        if (flag < numberOfStudents){
            arrayList.add(flag, student);
        }
    }
    public int getNumberOfStudents(){
        return arrayList.size();
    }

    public void getArrayList(){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.printf("%s", arrayList.get(i));
            if (i < arrayList.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
