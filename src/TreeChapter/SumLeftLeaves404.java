package TreeChapter;

/**
 * created by Hannah Li on 19/3/2
 * Project name: LeetcodeProject
 * LeetCode NO.: 404
 */
public class SumLeftLeaves404 {


    /**
     * Find the sum of all left leaves in a given binary tree.
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     *
     *   Return 24.
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int sum = sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        return sum;
    }
}
