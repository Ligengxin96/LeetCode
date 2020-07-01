package BinaryTreeInorderTraversal_97;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  BinaryTreeInorderTraversal_97
 * @created : 2020/7/1
 * @description : https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class BinaryTreeInorderTraversal {
//    递归解法
//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List result = new ArrayList();
//        inorderTraversal(root, result);
//        return result;
//    }
//
//    private static void inorderTraversal(TreeNode node, List result) {
//        if (node == null) {
//            return;
//        }
//        inorderTraversal(node.left, result);
//        result.add(node.val);
//        inorderTraversal(node.right, result);
//    }

    // 非递归解法
    public static List<Integer> inorderTraversal(TreeNode root) {
        List result = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        TreeNode currentNode = root;
        while (currentNode != null || !stack.empty()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stack.pop();
                result.add(currentNode.val);
                currentNode = currentNode.right;
            }
        }
        return result;
    }
}
