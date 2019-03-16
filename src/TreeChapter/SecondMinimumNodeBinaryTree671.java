package TreeChapter;

/**
 * created by Hannah Li on 19/3/15
 * Project name: LeetcodeProject
 * LeetCode NO.: 671
 */
public class SecondMinimumNodeBinaryTree671 {



    /**
     *Given such a binary tree, you need to output
     * the second minimum value in the set made of all the nodes' value in the whole tree.
     * Input:
     *     2
     *    / \
     *   2   5
     *      / \
     *     5   7
     *
     * Output: 5
     * Explanation: The smallest value is 2, the second smallest value is 5.
     *
     */
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        if(root.left == null && root.right == null) return -1;
        int left = root.left.val;
        int right  = root.right.val;
        if(root.left.val == root.val){
            left = findSecondMinimumValue(root.left);
        }
        if(root.right.val == root.val){
            right = findSecondMinimumValue(root.right);
        }
        if(left != -1 && right != -1){
            return Math.min(left, right);
        }else if(left != -1){
            return left;
        }else{
            return right;
        }
    }

    private  int min1 = Integer.MAX_VALUE;
    private  int min2 = Integer.MAX_VALUE;
    public int findSecondMinimumValue2(TreeNode root) {
        if(root != null){
            if(root.val < min1){
                min1 = root.val;
            }else if(root.val < min2 && root.val != min1){
                min2 = root.val;
            }
            if(root.val <= min2){
                findSecondMinimumValue2(root.left);
                findSecondMinimumValue2(root.right);
            }
        }
        return min2 == Integer.MAX_VALUE ? -1 : min2;
    }


}
