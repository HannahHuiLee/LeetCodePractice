package TreeChapter;

/**
 * created by Hannah Li on 19/2/24
 * Project name: LeetcodeProject
 * LeetCode NO.: 110
 */
public class BalancedBinaryTree110 {


    /**
     * Given a binary tree, determine if it is height-balanced. 高度平衡
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     *  深度差值
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return helper(root) != -1;
    }

    private int helper(TreeNode root) {
        if(root == null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        if(l == -1 || r == -1|| Math.abs(l - r) > 1){
            return -1;
        }
        return Math.max(l, r) + 1;
    }

}
