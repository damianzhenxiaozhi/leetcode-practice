package binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/7/8
 */
public class Tranverse {
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        // or do something else
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void midOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        midOrder(root.left);
        // or do something else
        System.out.println(root.val);
        midOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        // or do something else
        System.out.println(root.val);
    }

    public int getLayerCount(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int layerCount = 0;
        int currentLayerCount = 1;

        while (queue.peek() != null) {
            int nextLayerCount = 0;
            while (currentLayerCount > 0) {
                TreeNode p = queue.poll();
                currentLayerCount--;
                if (p.left != null) {
                    queue.offer(p.left);
                    nextLayerCount++;
                }
                if (p.right != null) {
                    queue.offer(p.right);
                    nextLayerCount++;
                }
            }
            layerCount++;
            currentLayerCount = nextLayerCount;
        }

        return layerCount;
    }

    public void layerOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            System.out.println(p.val);
            if (p.left != null) {
                queue.offer(p.left);
            }
            if (p.right != null) {
                queue.offer(p.right);
            }
        }
    }
}
