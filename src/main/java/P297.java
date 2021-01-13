import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/17
 */
public class P297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder();

        serialize(root, s);

        return "[" + s.substring(0, s.length() - 1) + "]";
    }

    private void serialize(TreeNode node, StringBuilder s) {
        if (node == null) {
            s.append("null,");
            return;
        }

        s.append(node.val).append(",");

        serialize(node.left, s);
        serialize(node.right, s);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() < 2 || data.charAt(0) != '[' || data.charAt(data.length() - 1) != ']') {
            return null;
        }

        Queue<String> q = new LinkedList<>(Arrays.asList(data.substring(1, data.length() - 1).split(",")));

        return deserialize(q);
    }

    private TreeNode deserialize(Queue<String> q) {
        if (q.isEmpty()) {
            return null;
        }

        String s = q.poll();
        if ("null".equals(s)) {
            return null;
        }

        TreeNode t = new TreeNode(Integer.parseInt(s));
        t.left = deserialize(q);
        t.right = deserialize(q);

        return t;
    }
}
