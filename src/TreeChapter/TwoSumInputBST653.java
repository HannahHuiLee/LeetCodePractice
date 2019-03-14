package TreeChapter;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * created by Hannah Li on 19/3/13
 * Project name: LeetcodeProject
 * LeetCode NO.: 653
 */
public class TwoSumInputBST653 {

    /**
     *Given a Binary Search Tree and a target number, return true if there exist two elements
     * in the BST such that their sum is equal to the given target.
     * 给出一个二叉搜索树和一个目标值，返回树中是否存在两个元素相加等于目标值。
     * Input:
     *     5
     *    / \
     *   3   6
     *  / \   \
     * 2   4   7
     *
     * Target = 9
     * Output: True
     */
    /*BFS 14ms*/
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(set.contains(k - node.val)){
                return true;
            }
            set.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return false;
    }

}
