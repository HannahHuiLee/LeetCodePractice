package TreeChapter;

/**
 * created by Hannah Li on 19/3/17
 * Project name: LeetcodeProject
 * LeetCode NO.: 687
 */
public class LongestUnivaluePath687 {

    /**
     *Given a binary tree, find the length of the longest path where each node in the
     * path has the same value. This path may or may not pass through the root.
     *               5
     *              / \
     *             4   5
     *            / \   \
     *           1   1   5
     *
     *  output :2
     */
    private int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        this.ans = 0;
        valuePath(root);
        return this.ans;
    }

    private int valuePath(TreeNode root) {
        if (root == null) return 0;
        int left = valuePath(root.left);
        int right = valuePath(root.right);

        int pLeft = 0;
        int pRight = 0;

        if(root.left != null && root.val ==  root.left.val) pLeft = left+1;
        if(root.right != null && root.val == root.right.val) pRight = right+1;

        this.ans = Math.max(this.ans, pLeft + pRight);
        return Math.max(pLeft, pRight);
    }


}
