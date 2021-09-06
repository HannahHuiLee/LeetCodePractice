package BFSDFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by Hannah Li on 2020-10-18
 * Project name: LeetcodeProject
 * LeetCode NO.:
 */
public class BinaryTreeLevelOrderTraversal102 {



    /**
     * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
     * [3,9,20,null,null,15,7],
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        // corner case
        if (root == null) return res;
        // create FIFO data structure - queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            // 区分不同的level
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i< size; i++){
                TreeNode head = queue.poll();
                level.add(head.val);
                // 往里加nodes， 改变size
                if (head.left != null) queue.offer(head.left);
                if (head.right != null) queue.offer(head.right);
            }
            res.add(level);
        }
        return res;
    }
}
