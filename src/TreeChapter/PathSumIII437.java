package TreeChapter;

/**
 * created by Hannah Li on 19/3/3
 * Project name: LeetcodeProject
 * LeetCode NO.: 437
 */
public class PathSumIII437 {

    /**
     *You are given a binary tree in which each node contains an integer value.
     * Find the number of paths that sum to a given value.
     * 给你一棵二叉树，返回单向的路径和等于sum的路径数量。
     *       10       sum = 8;
     *      /  \
     *     5   -3
     *    / \    \
     *   3   2   11
     *  / \   \
     * 3  -2   1
     *
     * Return 3.
     * DFS
     */
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int helper(TreeNode root, int sum) {
        int res = 0;
        if(root == null) return 0;
        if(root.val == sum) res++;
        res += helper(root.left, sum - root.val) + helper(root.right, sum - root.val);
        return res;
    }


}
