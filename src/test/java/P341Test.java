import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/16
 */
public class P341Test {
    @Test
    public void testBasic() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;

        P341 s = new P341();
        int[] result = s.topKFrequent(nums, k);

        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, result);
    }
}
