package TreeChapter;

/**
 * created by Hannah Li on 19/3/21
 * Project name: LeetcodeProject
 * LeetCode NO.: 897
 */
public class IncreasingOrderSearchTree897 {


    /**
     *Given a tree, rearrange the tree in in-order so that the leftmost node in the tree
     * is now the root of the tree, and every node has no left child and only 1 right child.
     *给定一棵二叉树，要求把原来的树按照中序遍历的顺序重新组织，拉成一条长链，第一个结点在树根，下一个结点是它的右孩子，以此类推。
     */
    TreeNode result = new TreeNode(0);
    TreeNode temp = result;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return root;
        if(root.left != null) {
            increasingBST(root.left);
        }
        temp.right = new TreeNode(root.val);
        temp = temp.right;
        if(root.right != null){
            increasingBST(root.right);
        }
        return result.right;
    }
}
