import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/16
 */
public class P1Test {
    @Test
    public void testBasic() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        P1 s = new P1();
        int[] result = s.twoSum(nums, target);
        int[] expected = new int[]{0, 1};

        Arrays.sort(expected);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }
}
