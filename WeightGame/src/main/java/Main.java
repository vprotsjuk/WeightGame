import java.util.List;

public class Main {
    public static void main(String[] args) {

        int goal = 20;

        Answer answer = new Answer();
        List<Integer> listAnswer = answer.totalWeightsList(goal);
        System.out.println("Goal " + goal+ " " + listAnswer);

        int check = 5;

        CheckList checkList = new CheckList();
        List<Integer> listCheck = checkList.checkAnswerList(listAnswer, check);
        System.out.println("Check " + check + " " + listCheck);

        Debug debug = new Debug(checkList, answer);
        System.out.println();
        debug.debugResult(goal);
        //        debug.debugResult(answer.goal);
    }
}


