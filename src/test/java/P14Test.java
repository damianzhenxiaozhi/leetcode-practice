import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/16
 */
public class P14Test {
    @Test
    public void testBasic() {
        String[] strs = new String[]{"flower", "flow", "flight"};

        P14 s = new P14();
        String result = s.longestCommonPrefix(strs);

        String expected = "fl";
        assertEquals(expected, result);
    }
}
