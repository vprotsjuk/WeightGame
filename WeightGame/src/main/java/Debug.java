import java.util.List;

public class Debug {
    private final CheckList checkList;
    private final Answer answer;

    public Debug(CheckList checkList, Answer answer){
        this.checkList = checkList;
        this.answer = answer;
    }

    public void debugResult(int goal) {

        int temp1 = goal;
        while (temp1 > 0) {
            System.out.println("Check " + temp1 + " " + checkList.checkAnswerList(checkList.shortL(answer.totalWeightsList(goal), temp1), temp1));
            temp1 -= 1;
        }
        // можно убрать все, что снизу
        int temp2 = goal;
        int totalSumInArrayList = 0;
        while (temp2 > 0) {
            for (int i : checkList.checkAnswerList(checkList.shortL(answer.totalWeightsList(goal), temp2), temp2)) {
                totalSumInArrayList += i;
            }
            if (totalSumInArrayList != temp2) {
                System.out.println("ERROR");
                return;
            }
            temp2--;
            totalSumInArrayList = 0;
        }



//        for (int temp1 = goal; temp1 > 0; temp1--) {
//            List<Integer> totalWeightsList = answer.totalWeightsList(goal);
//            List<Integer> shortL = checkList.shortL(totalWeightsList, temp1);
//            List<Integer> answerList = checkList.checkAnswerList(shortL, temp1);
//            System.out.println("Check " + temp1 + " " + answerList);
//        }
    }
}

