import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnswerTest {

    @Test
    public void testTotalWeightsList() {
        Answer answer = new Answer();
        List<Integer> result = answer.totalWeightsList(10);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(6);
        assertEquals(expected, result);
    }

}
