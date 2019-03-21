package TreeChapter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Hannah Li on 19/3/20
 * Project name: LeetcodeProject
 * LeetCode NO.: 872
 */
public class LeafSimilarTrees872 {


    /**
     * Consider all the leaves of a binary tree.  From left to right order,
     * the values of those leaves form a leaf value sequence.
     * 先序遍历，找到叶子节点依次比较
     */
    private List<TreeNode> node1 = new ArrayList<>();
    private List<TreeNode> node2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        frontTraversal(root1, node1);
        frontTraversal(root2, node2);
        int len1 = node1.size();
        int len2 = node2.size();
        if(len1 != len2) return false;
        for(int i = 0; i< len1; i++){
            if(node1.get(i).val != node2.get(i).val)return false;
        }
        return true;
    }

    private void frontTraversal(TreeNode root, List<TreeNode> node) {
        if(root == null) return;
        if(root.left != null) frontTraversal(root.left, node);
        if(root.left == null && root.right == null) node.add(root);
        if(root.right != null) frontTraversal(root.right, node);
    }

}
