import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/17
 */
public class P102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        List<List<Integer>> result = new ArrayList<>();

        q.offer(root);
        while (!q.isEmpty()) {
            int layerNodeCount = q.size();

            List<Integer> layerResult = new ArrayList<>();
            for (int i = 0; i < layerNodeCount; i++) {
                TreeNode t = q.poll();
                if (t == null) {
                    continue;
                }

                layerResult.add(t.val);
                q.offer(t.left);
                q.offer(t.right);
            }

            if (!layerResult.isEmpty()) {
                result.add(layerResult);
            }
        }

        return result;
    }
}
