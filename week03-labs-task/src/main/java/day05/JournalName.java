package day05;

import java.util.ArrayList;
import java.util.List;

public class JournalName {

    public static void main(String[] args) {

        String firstName = "John Doe  ";
        String secondName = "Madonna  ";
        String thirdName = " Steve Adler ";
        String fourthName = "Jane Doe";
        String fifthName = " Paul";

        Journal journal = new Journal();

        System.out.println(journal.addStudent(firstName));
        System.out.println(journal.addStudent(secondName));
        System.out.println(journal.addStudent(thirdName));
        System.out.println(journal.addStudent(fourthName));
        System.out.println(journal.addStudent(fifthName));

        System.out.println(journal.getStudents());
    }
}
