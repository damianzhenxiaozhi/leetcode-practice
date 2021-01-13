import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/17
 */
public class P102Test {
    @Test
    public void testBasic() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        P102 s = new P102();
        List<List<Integer>> result = s.levelOrder(root);
        System.out.println(result);
    }
}
