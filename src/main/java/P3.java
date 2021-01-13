import java.util.HashMap;
import java.util.Map;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/22
 */
public class P3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            Integer index = window.get(s.charAt(right));
            if (index == null || index < left) {
                if (right - left + 1 > max) {
                    max = right - left + 1;
                }
            } else {
                left = index + 1;
                if (right - left + 1 > max) {
                    max = right - left + 1;
                }
            }
            window.put(s.charAt(right), right);
            right++;
        }

        return max;
    }
}
