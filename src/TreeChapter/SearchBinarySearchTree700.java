package TreeChapter;

/**
 * created by Hannah Li on 19/3/19
 * Project name: LeetcodeProject
 * LeetCode NO.: 700
 */
public class SearchBinarySearchTree700 {


    /**
     * Given the root node of a binary search tree (BST) and a value.
     * You need to find the node in the BST that the node's value equals the given value.
     * Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
     * 在一个BST中查找某值，如果找到的话，返回找到的那个节点，如果找不到就返回None.
     * <p>
     * 只要是BST查找，那肯定都好说。树的查找比较简单的就是递归，如果节点是空，那么肯定没找到；
     * 节点值相等，返回这个节点；如果节点值小于要查找的值，那么在当前节点的右子树中找；否则在左子树中找。
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) {
            return root;
        }else if(root.val < val){
            return searchBST(root.right, val);
        }else{
            return searchBST(root.left, val);
        }
    }
}
