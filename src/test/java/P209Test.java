import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/30
 */
public class P209Test {
    @Test
    public void testBasic() {
        int[] nums = {1, 2, 3, 4, 5};
        int s = 15;

        P209 solution = new P209();
        int res = solution.minSubArrayLen(s, nums);
        assertEquals(5, res);
    }
}
