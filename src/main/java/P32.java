import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/7/5
 */
public class P32 {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();

        int start = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    start = i + 1;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        max = Math.max(max, i - start + 1);
                    } else {
                        max = Math.max(max, i - stack.peek());
                    }
                }
            }
        }

        return max;
    }
}
