package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> students = new ArrayList<>();

    public boolean addStudent(String studentName) {
        if (studentName.trim().contains(" ")) {
            students.add(studentName);
            return true;
        } else {
            return false;
        }
    }

    public List<String> getStudents() {
        return students;
    }
}
