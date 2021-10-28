package day04;

import java.util.ArrayList;
import java.util.List;

public class Prison {

    List<Boolean> locks;

    public Prison(List<Boolean> locks) {
        this.locks = locks;
    }

    public void openFreeCells() {
        for (int i = 0; i < locks.size(); i++) {
            for (int j = i; j < locks.size(); j += (i + 1)) {
                locks.set(j, !locks.get(j));
            }
        }
    }

    public List<Integer> getOpenedCells() {
        List<Integer> openedCells = new ArrayList<>();
        for (int i = 0; i < locks.size(); i++) {
            if (locks.get(i) == true) {
                openedCells.add(i+1);
            }
        }
        return openedCells;
    }
}
