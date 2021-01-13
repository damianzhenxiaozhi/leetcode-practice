import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/18
 */
public class P1028 {
    public TreeNode recoverFromPreorder(String s) {
        if (s.length() == 0) {
            return null;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        int i = 0;
        while (i < s.length()) {
            int depth = 0;
            while (i < s.length() && s.charAt(i) == '-') {
                depth++;
                i++;
            }

            int val = 0;
            while (i < s.length() && s.charAt(i) != '-') {
                val = 10 * val + (s.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(val);
            if (depth == stack.size()) {
                if (!stack.isEmpty()) {
                    stack.peek().left = node;
                }
            } else {
                while (depth != stack.size()) {
                    stack.pop();
                }

                stack.peek().right = node;
            }
            stack.push(node);
        }

        while (stack.size() > 1) {
            stack.pop();
        }

        return stack.pop();
    }
}
