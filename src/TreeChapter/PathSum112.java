package TreeChapter;

import java.util.Stack;

/**
 * created by Hannah Li on 19/2/26
 * Project name: LeetcodeProject
 * LeetCode NO.: 112
 */
public class PathSum112 {

    /**
     * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
     * such that adding up all the values along the path equals the given sum.
     *       5
     *      / \
     *     4   8
     *    /   / \
     *   11  13  4
     *  /  \      \
     * 7    2      1
     * sum = 22
     */
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public boolean hasPathSum2(TreeNode root, int sum) {
        if(root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(cur.left == null && cur.right == null) {
                if(cur.val == sum) return true;
            }
            if(cur.left != null){
                stack.push(cur.left);
                cur.left.val += cur.val;
            }
            if(cur.right != null){
                stack.push(cur.right);
                cur.right.val += cur.val;
            }
        }
        return false;
    }


}
