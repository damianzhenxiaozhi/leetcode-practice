package binarytree;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/7/8
 */
public class BST {
    public TreeNode findByRecursive(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        } else if (val > root.val) {
            return findByRecursive(root.right, val);
        } else {
            return findByRecursive(root.left, val);
        }
    }

    public TreeNode findByLoop(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } else if (root.val > val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;
    }

    public void insertByRecursive(TreeNode root, int val) {
        if (root == null) {
           root = new TreeNode(val);
           return;
        }

        if (val < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
                return;
            } else {
                insertByRecursive(root.left, val);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
                return;
            } else {
                insertByRecursive(root.right, val);
            }
        }
    }

    public void insertByLoop(TreeNode root, int val) {

    }

    public void delete(TreeNode root, int val) {

    }
}
