package TreeChapter;

/**
 * created by Hannah Li on 19/3/8
 * Project name: LeetcodeProject
 * LeetCode NO.: 563
 */
public class BinaryTreeTilt563 {


    public static void main(String [] args){
        BinaryTreeTilt563 btt = new BinaryTreeTilt563();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.left=new TreeNode(5);
        System.out.println(btt.findTilt(root));
    }

    /**
     *Given a binary tree, return the tilt of the whole tree.
     *
     * The tilt of a tree node is defined as the absolute difference between the sum of all
     * left subtree node values and the sum of all right subtree node values. Null node has tilt 0.
     * 给出一个二叉树，返回整个树的差值。
     *
     * 思路： 递归，从根递归到叶，得到每个结点左子树所有结点的和，每个结点右子树所有结点的和，再相减取绝对值。
     */
    int result = 0;
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        recursion(root);
        return result;

    }

    private int recursion(TreeNode root) {
        int left = 0;
        int right = 0;
        if(root.left != null){
            left = root.left.val + recursion(root.left);
        }
        if(root.right != null){
            right = root.right.val + recursion(root.right);
        }
        result += Math.abs(left -right);
        return left + right;
    }
}
