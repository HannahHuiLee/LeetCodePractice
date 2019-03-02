package TreeChapter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Hannah Li on 19/3/1
 * Project name: LeetcodeProject
 * LeetCode NO.: 257
 */
public class BinaryTreePaths257 {


    /**
     * Given a binary tree, return all root-to-leaf paths.
     *   1
     *  /   \
     * 2     3
     *  \
     *   5
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        helper(res, root, "");
        return res;
    }

    private void helper(List<String> res, TreeNode root, String path) {
        if(root.left == null && root.right == null){
            res.add(path + root.val);
        }
        if(root.left != null){
            helper(res, root.left, path + root.val +"->");
        }
        if(root.right != null){
            helper(res, root.right, path + root.val +"->");
        }
    }


}
