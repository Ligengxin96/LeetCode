package SameTree_100;

import Utils.TreeNode;

import java.util.Stack;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  SameTree_100
 * @created : 2020/7/2
 * @description : https://leetcode.com/problems/same-tree/
 */
public class SameTree {
//    非递归解法
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        boolean isEqual = true;
//        Stack<TreeNode> stack = new Stack();
//        if(p == null && q == null) {
//            return true;
//        }
//        stack.push(p);
//        stack.push(q);
//        while(stack.size() > 0){
//            TreeNode currentQ = stack.pop();
//            TreeNode currentP = stack.pop();
//            if (currentQ == null || currentP == null || currentQ.val != currentP.val) {
//                isEqual = false;
//                break;
//            }
//            if (currentQ.left != null || currentP.left != null) {
//                stack.push(currentP.left);
//                stack.push(currentQ.left);
//            }
//            if (currentQ.right != null || currentP.right != null) {
//                stack.push(currentP.right);
//                stack.push(currentQ.right);
//            }
//        }
//        return isEqual;
//    }
    // 递归解法
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || q.val != p.val) {
            return false;
        }
        boolean isEqual = isSameTree(p.left, q.left); // 先看看左边是否一样 如果不一样就不需要比较右边了
        if(!isEqual) {
            return false;
        }
        return isSameTree(p.right, q.right);
    }
}
