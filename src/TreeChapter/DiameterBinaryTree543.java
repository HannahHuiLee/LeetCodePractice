package TreeChapter;

/**
 * created by Hannah Li on 19/3/6
 * Project name: LeetcodeProject
 * LeetCode NO.: 543
 */
public class DiameterBinaryTree543 {


    /**
     * Given a binary tree, you need to compute the length of the diameter of the tree.
     * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
     * This path may or may not pass through the root.
     * 给定一颗二叉树，寻找这棵树的直径，直径定义为这棵树中任意两个节点的路径长度最大值。
     * 两个节点间的路径长度是计算的两个节点间连线的个数（也就是边的个数）
     *  1
     * / \
     * 2   3
     * / \
     * 4   5
     * Return 3
     */
    int depth = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        search(root);
        return depth;
    }

    private int search(TreeNode root) {
        if (root == null) return 0;
        int left = search(root.left);
        int right = search(root.right);
        if (depth < left + right) {
            depth = left + right;
        }
        return left > right ? left + 1 : right + 1;
    }


}
