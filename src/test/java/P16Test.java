import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/15
 */
public class P16Test {
    @Test
    public void testBasic() {
        int[] nums = {1, 2, 5, 10, 11};
        int target = 12;

        P16 s = new P16();
        int result = s.threeSumClosest(nums, target);
        assertEquals(13, result);
    }
}
