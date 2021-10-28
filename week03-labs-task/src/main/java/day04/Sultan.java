package day04;

import java.util.ArrayList;
import java.util.List;

public class Sultan {

    public static void main(String[] args) {

        List<Boolean> locks = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            locks.add(false);
        }

        Prison prison = new Prison(locks);

        prison.openFreeCells();
        List<Integer> openedCells = prison.getOpenedCells();

        System.out.println(openedCells);
    }
}
