import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckListTest {

    @Test
    public void testCheckAnswerList() {
        Answer answer = new Answer();
        CheckList checkList = new CheckList();
        List<Integer> result = checkList.checkAnswerList(answer.totalWeightsList(10), 10);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(6);
        assertEquals(expected, result);
    }
}
