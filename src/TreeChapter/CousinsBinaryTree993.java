package TreeChapter;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by Hannah Li on 19/3/23
 * Project name: LeetcodeProject
 * LeetCode NO.: 993
 */
public class CousinsBinaryTree993 {


    /**
     * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
     * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
     * 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。
     *
     * 思路： 使用bfs算法对树进行遍历，在遍历过程中对每个节点进行存储，记录该节点所在的层数以及该节点的父节点
     */
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            boolean isAexist = false;
            boolean isBexist = false;
            for(int i = 0; i< size; i++){
                TreeNode cur = queue.poll();
                if(cur.val == x) isAexist = true;
                if (cur.val == y) isBexist = true;
                if(cur.left != null && cur.right != null){
                    if(cur.left.val == x && cur.right.val == y) return false;
                    if(cur.left.val == y && cur.right.val == x) return false;
                }
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
            if(isAexist && isBexist) return true;
        }
        return false;
    }

}
