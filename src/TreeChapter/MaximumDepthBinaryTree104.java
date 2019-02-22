package TreeChapter;

/**
 * created by Hannah Li on 19/2/21
 * Project name: LeetcodeProject
 * LeetCode NO.: 104
 */
public class MaximumDepthBinaryTree104 {


    /**
     *Given a binary tree, find its maximum depth.
     *
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     *    3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     *  return its depth = 3.
     */
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }

    public int maxDepth2(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth? leftDepth+1 : rightDepth+1;
    }

}
