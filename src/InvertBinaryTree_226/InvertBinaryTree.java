package InvertBinaryTree_226;

import Utils.TreeNode;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  InvertBinaryTree_226
 * @created : 2020/7/3
 * @description :
 */
public class InvertBinaryTree {
    // 思路: 考虑最小的情况就很容易得到这个答案 最简单的树就是 3个节点, 较换下左右节点并返回自己
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(right);
        return root;
    }
}
