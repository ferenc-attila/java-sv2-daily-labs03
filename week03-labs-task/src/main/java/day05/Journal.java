package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    List<String> children;

    public Journal(List<String> children) {
        this.children = children;
    }

    public boolean addStudent(String studentName) {
        if (studentName.substring(1, studentName.length()-1).contains(" ")) {
            children.add(studentName);
            return true;
        } else {
            return false;
        }
    }

    public List<String> getChildren() {
        return children;
    }
}
