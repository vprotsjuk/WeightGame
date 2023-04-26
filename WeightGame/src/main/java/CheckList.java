import java.util.ArrayList;
import java.util.List;

public class CheckList {


    public  List<Integer> checkAnswerList(List<Integer> shortL, int check) {
        if (check > shortL.stream().mapToInt(Integer::intValue).sum()){
            throw new IllegalArgumentException("Error, 'Check' can't be > 'Goal'");
        }
        List<Integer> answerList = new ArrayList<>();
        shortL = shortL(shortL, check);

        while (check != 0) {
            if (check == shortL.get(shortL.size() - 1)) {
                answerList.add(0, shortL.get(shortL.size() - 1));
                return answerList;
            }
            if (check > shortL.get(shortL.size() - 1)) {
                answerList.add(0, shortL.get(shortL.size() - 1));
                check = check - shortL.get(shortL.size() - 1);
                shortL = shortL(shortL, Math.abs(check));
            }
            if (check < shortL.get(shortL.size() - 1)) {
                answerList.add(0, shortL.get(shortL.size() - 1));
                check = check - shortL.get(shortL.size() - 1);
                shortL = shortL(shortL, Math.abs(check));
                if (check < 0) {
                    shortL.set(shortL.size() - 1, shortL.get(shortL.size() - 1) * -1);
                }
            }
        }
        System.out.println(shortL);
        System.out.println(answerList);
        for (int i = 0; i < answerList.size(); i++) {
            if (answerList.size() > 1 && Math.abs(answerList.get(i)) == Math.abs(answerList.get(i + 1))) {
                System.out.println("Error");
            }
        }
        return answerList;
    }



    public  List<Integer> shortL(List<Integer> list, int check) {
        List<Integer> shortList = new ArrayList<>();
        int temp = 0;
        int curr = 0;
        for (int i = 0; i < list.size(); i++) {
            if (temp < check) {
                temp += list.get(i);
                curr = i;
            }
        }
        for (int i = 0; i <= curr; i++) {
            shortList.add(list.get(i));
        }
        return shortList;
    }

}


