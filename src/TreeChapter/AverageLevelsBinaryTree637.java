package TreeChapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by Hannah Li on 19/3/12
 * Project name: LeetcodeProject
 * LeetCode NO.:
 */
public class AverageLevelsBinaryTree637 {


    /**
    * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
     * Input:
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * Output: [3, 14.5, 11]
     */
    /*DFS*/
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>res = new ArrayList<>();
        List<List<Integer>> nodes = new ArrayList<>();

        if(root == null) return res;
        dfs(nodes, root, 0);
        for(int i = 0; i<nodes.size(); i++){
            double total = 0.0;
            for(int j = 0; j <nodes.get(i).size(); j++){
                total += nodes.get(i).get(j);
            }
            res.add(total / nodes.get(i).size());
        }
        return res;
    }

    private void dfs(List<List<Integer>> res, TreeNode node, int level) {
        if(node == null) return;
        if(level >= res.size()){
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        dfs(res, node.left, level+1);
        dfs(res, node.right, level+1);
    }


    /*BFS*/
    public List<Double> averageOfLevels2(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return result;

        q.add(root);
        while (!q.isEmpty()){
            int n = q.size();
            double sum = 0.0;
            for(int i = 0; i< n; i++){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            result.add(sum / n);
        }
        return result;
    }



}
