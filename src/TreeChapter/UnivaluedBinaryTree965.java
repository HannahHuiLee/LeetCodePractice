package TreeChapter;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by Hannah Li on 19/3/22
 * Project name: LeetcodeProject
 * LeetCode NO.: 965
 */
public class UnivaluedBinaryTree965 {

    /**
     * A binary tree is univalued if every node in the tree has the same value.
     */
    public boolean isUnivalTree(TreeNode root) {
        return dfs(root, root.val);
    }

    private boolean dfs(TreeNode root, int val) {
        if(root == null) return true;
        if(root.val != val) return false;
        return dfs(root.left,val) && dfs(root.right,val);
    }

    /**  BFS  */
    public boolean isUnivalTree2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode n = q.poll();
            if(n.val != root.val) return false;
            if(n.left != null){
                q.offer(n.left);
            }
            if(n.right != null){
                q.offer(n.right);
            }
        }
        return true;
    }

}
