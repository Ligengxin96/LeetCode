package SymmetricTree_101;

import Utils.TreeNode;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  SymmetricTree_101
 * @created : 2020/7/3
 * @description :
 */
public class SymmetricTree {
    // 这题思路可以转换为 第100题的思路. 把树拆分成左右子树.然后判断两树相等
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isEqual(root.left, root.right);
    }

    private boolean isEqual(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isEqual(p.left, q.right) && isEqual(q.left, p.right);
    }
}
