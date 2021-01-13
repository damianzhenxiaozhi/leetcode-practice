import java.util.*;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/12/4
 */
public class P103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean odd = false;
        int levelCount = 1;

        List<List<Integer>> result = new ArrayList<>();
        while (!q.isEmpty()) {
            odd = !odd;

            int nextLevelCount = 0;
            List<TreeNode> nextNodes = new ArrayList<>();
            List<Integer> levelValues = new ArrayList<>();
            while (levelCount-- > 0) {
                TreeNode node = q.poll();

                levelValues.add(node.val);

                if (node.left != null) {
                    nextNodes.add(node.left);
                    nextLevelCount++;
                }
                if (node.right != null) {
                    nextNodes.add(node.right);
                    nextLevelCount++;
                }
            }

            levelCount = nextLevelCount;
            for (TreeNode node : nextNodes) {
                q.offer(node);
            }

            if (!odd) {
                Collections.reverse(levelValues);
            }

            result.add(levelValues);
        }

        return result;
    }

    public static void main(String[] args) {
        P103 s = new P103();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = s.zigzagLevelOrder(root);
        for (List<Integer> line : result) {
            for (Integer v : line) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
