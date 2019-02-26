package TreeChapter;

/**
 * created by Hannah Li on 19/2/25
 * Project name: LeetcodeProject
 * LeetCode NO.: 111
 */
public class MinimumDepthBinaryTree111 {

    /**
     *Given a binary tree, find its minimum depth.
     * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     *    3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     *return its minimum depth = 2.
     *
     */
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null || root.right == null){
            return Math.max(minDepth(root.left), minDepth(root.right))+1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
}
