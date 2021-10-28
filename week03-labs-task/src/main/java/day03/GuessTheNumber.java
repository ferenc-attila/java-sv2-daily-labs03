package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    final int number = random.nextInt(100) + 1;
    private int tip;
    private String text;

    public GuessTheNumber() {
        this.text = "Enter your first tip:";
    }

    public void startCompetition() {
        askNextTip();
        for (int i = 0; i < 6; i++) {
            if (tip != number & i < 5) {
                text = inspectNumber(i);
                askNextTip();
            } else {
                text = winOrLose(i);
                printText(text);
                break;
            }
        }
    }

    public void printText(String text) {
        System.out.println(text);
    }

    public void askNextTip() {
        printText(text);
        tip = scanner.nextInt();
        scanner.nextLine();
    }

    public String inspectNumber(int i) {
        return (tip < number) ? "Your tip (" + tip + ") is lesser then number.\n" +
                                "You have " + (5 - i) + " tips left.\n" +
                                "Enter your next tip:"
                                :
                                "Your tip (" + tip + ") is greater then number.\n" +
                                "You have " + (5 - i) + " tips left.\n" +
                                "Enter your next tip:";
    }

    public String winOrLose(int i) {
        return (tip == number | i < 5) ? "You won!"
                                        :
                                        "You loose! The number was " + number + ".";
    }
}
