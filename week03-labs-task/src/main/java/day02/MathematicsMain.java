package day02;

import java.util.Scanner;

public class MathematicsMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Mathematics mathematics = new Mathematics();

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println(mathematics.isPrime(number));
    }
}
