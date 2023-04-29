package en.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.List;

/* 
Feel like a university dean
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Stephan Fontaine");
        students.add("Victor Brown");
        students.add("Max Abelman");
        students.add("Nadine Nkosi");
        students.add("Aimee Blanchet");
        students.add("Nick Burns");
        students.add("Chika Tanaka");
    }

    public void exclude(String excludedStudent) {
        students.removeIf(student -> student.equals(excludedStudent));
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Victor Brown");
        universityGroup.students.forEach(System.out::println);
    }
}