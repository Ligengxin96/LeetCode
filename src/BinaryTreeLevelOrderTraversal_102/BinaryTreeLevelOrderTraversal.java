package BinaryTreeLevelOrderTraversal_102;

import Utils.TreeNode;

import java.util.*;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  BinaryTreeLevelOrderTraversalII_107
 * @created : 2020/7/7
 * @description :
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return new ArrayList();
        }
        LinkedList result = new LinkedList();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size() > 0) {
            List thisDepthValue = new ArrayList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                thisDepthValue.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            result.addFirst(thisDepthValue);
        }

        return result;
    }
}
