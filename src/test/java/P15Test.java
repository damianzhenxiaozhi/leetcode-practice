import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/15
 */
public class P15Test {
    @Test
    public void testBasic() {
        int[] nums = {0, 0, 0};
        P15 s = new P15();

        List<List<Integer>> result = s.threeSum(nums);

        int[] expected = new int[]{0, 0, 0};

        Integer[] answer = result.get(0).toArray(new Integer[0]);

        int[] answer1 = new int[answer.length];
        int i = 0;
        for (Integer n : answer) {
            answer1[i++] = n;
        }

        Arrays.sort(answer1);
        Arrays.sort(expected);
        assertArrayEquals(expected, answer1);
    }
}
