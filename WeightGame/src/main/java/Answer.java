import java.util.ArrayList;
import java.util.List;

public class Answer {
    public List<Integer> totalWeightsList(int goal) {
        int goalTemp = goal;
        List<Integer> list = new ArrayList<>();
        if (goalTemp % 3 == 0) {
            list.add(0, goalTemp / 3 * 2);
            goalTemp = goalTemp / 3 * 2;
        } else {
            list.add(0, goalTemp / 3 * 2 + 1);
            goalTemp = goalTemp / 3 * 2 + 1;
        }
        while (goalTemp > 1) {
            if (goalTemp % 3 == 0) {
                list.add(0, goalTemp / 3);
                goalTemp = goalTemp / 3;
            } else {
                list.add(0, goalTemp / 3 + 1);
                goalTemp = goalTemp / 3 + 1;
            }
        }
        int sumInList = 0;
        for (int i : list) {
            sumInList += i;
        }
        if (sumInList < goal) {
            list.add(0, 1);
        }
        int i = 0;
        while (getDiff(list, goal) > 0) {
            list.set(list.size() - 1 - i, list.get(list.size() - 1 - i) - 1);
            i++;
        }
        return list;
    }

    private int getDiff(List<Integer> list, int goal) {
        int diff = goal;
        for (int i : list) {
            diff -= i;
        }
        return Math.abs(diff);
    }
}



