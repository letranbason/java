import com.sv.son.Course;
import com.sv.son.Semester;
import com.sv.son.Student;

public class Main {
    public static void main(String[] args) {
        Student Son = new Student("Son", 123456);
        Course java = new Course("Java", "MTH121321");
        Semester semester = new Semester("Hk1 2022 - 2023");
        System.out.printf("");
        Son.display();
        java.addStudent(Son);
        semester.display();






    }
}