package TreeChapter;

/**
 * created by Hannah Li on 19/3/10
 * Project name: LeetcodeProject
 * LeetCode NO.: 617
 */
public class MergeTwoBinaryTrees617 {


    /**
     * Given two binary trees and imagine that when you put one of them to cover the other,
     * some nodes of the two trees are overlapped while the others are not.
     *给两个二叉树想要合并，有一些结点会重叠而有一些不会，现在想把重叠的结点值变为两者值相加，不重叠的直接用，构建出新的树
     *
     * 思想：使用递归的方法，对于每一个节点获得值的方法相同。
     **/
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 ==  null) return t2;
        if(t2 ==  null) return t1;
        TreeNode root = new TreeNode(t1.val+t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);
        return root;
    }
}
