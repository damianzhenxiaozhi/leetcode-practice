import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/17
 */
public class P449 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder("[");

        serialize(root, s);

        s.setLength(s.length() - 1);

        s.append("]");

        return s.toString();
    }

    private void serialize(TreeNode t, StringBuilder s) {
        if (t == null) {
            return;
        }

        s.append(t.val).append(",");
        serialize(t.left, s);
        serialize(t.right, s);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() < 2 || data.charAt(0) != '[' || data.charAt(data.length() - 1) != ']') {
            return null;
        }

        Queue<String> q = new LinkedList<>(Arrays.asList(data.substring(1, data.length() - 1).split(",")));

        return deserialize(q, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode deserialize(Queue<String> q, Integer min, Integer max) {
        if (q.isEmpty()) {
            return null;
        }

        String s = q.peek();
        int val = Integer.parseInt(s);
        if (val < min || val > max) {
            return null;
        }

        q.poll();

        TreeNode t = new TreeNode(val);
        t.left = deserialize(q, min, val);
        t.right = deserialize(q, val, max);

        return t;
    }
}
