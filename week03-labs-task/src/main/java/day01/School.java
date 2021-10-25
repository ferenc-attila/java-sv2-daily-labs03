package day01;

public class School {

    public static void main(String[] args) {

        Students students = new Students();
        students.addHeight(165);
        students.addHeight(174);
        students.addHeight(195);
        students.addHeight(182);

        System.out.println(students.isHeightIncreasing());
    }
}
