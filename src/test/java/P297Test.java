import org.junit.jupiter.api.Test;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/17
 */
public class P297Test {
    @Test
    public void testBasic() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        P297 s = new P297();
        String serializeResult = s.serialize(root);
        TreeNode result = s.deserialize(serializeResult);
        System.out.println(result);
    }
}
