/**
 * @author fanzhen
 * @version v1
 * @date 2020/7/5
 */
public class P108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        } else if (left == right) {
            return new TreeNode(nums[left]);
        } else {
            int middle = (left + right) / 2;
            TreeNode t = new TreeNode(nums[middle]);
            t.left = sortedArrayToBST(nums, left, middle - 1);
            t.right = sortedArrayToBST(nums, middle + 1, right);
            return t;
        }
    }
}
