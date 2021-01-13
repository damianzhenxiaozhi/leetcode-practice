import org.junit.jupiter.api.Test;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/17
 */
public class P449Test {
    @Test
    public void testBasic() {
        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(1);
        t.right = new TreeNode(3);

        P449 s = new P449();
        String serializeString = s.serialize(t);
        TreeNode res = s.deserialize(serializeString);

        System.out.println(res);
    }
}
