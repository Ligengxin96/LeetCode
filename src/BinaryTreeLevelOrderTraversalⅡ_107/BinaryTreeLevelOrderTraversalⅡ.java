package BinaryTreeLevelOrderTraversalⅡ_107;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  BinaryTreeLevelOrderTraversalII_107
 * @created : 2020/7/7
 * @description :
 */
public class BinaryTreeLevelOrderTraversalⅡ {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList();
        }
        List result = new ArrayList();
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
            result.add(thisDepthValue);
        }

        return result;
    }
}
