package TreeChapter;

/**
 * created by Hannah Li on 19/3/5
 * Project name: LeetcodeProject
 * LeetCode NO.: 538
 */
public class ConvertBSTGreaterTree538 {

    /**
     *Given a Binary Search Tree (BST), convert it to a Greater Tree such that
     * every key of the original BST is changed to the original key plus sum of
     * all keys greater than the original key in BST.
     * 把每个结点值加上所有比它大的结点值总和当作新的结点值。
     *               5
     *             /   \
     *            2     13
     */
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        helper(root);
        return root;
    }

    private void helper(TreeNode root) {
        if(root == null) return;
        helper(root.right);
        root.val += sum;
        sum = root.val;
        helper(root.left);
    }
}
