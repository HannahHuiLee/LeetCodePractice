package TreeChapter;

/**
 * created by Hannah Li on 19/2/20
 * Project name: LeetcodeProject
 * LeetCode NO.: 101
 */
public class SymmetricTree101 {

    /**
     *Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
     *   题意：判断一个二叉树是不是一个镜面树，想象把二叉树反转，得到的树是不是和原树相同。
     *
     *   思路：
     * 一个二叉树如果是镜面树需要满足两个条件：
     * 1、根节点的左右叶子节点值相同；2、左节点的左子树是右节点的右子树的镜面，左节点的右子树是右节点的左子树的镜面。
     */
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return helper(left.left, right.right) && helper(left.right, right.left);
    }

}
