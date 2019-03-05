package TreeChapter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Hannah Li on 19/3/4
 * Project name: LeetcodeProject
 * LeetCode NO.: 501
 */
public class FindModeBinarySearchTree501 {

    Integer prev = null;
    int count = 1;
    int max = 0;
    /**
     * Given a binary search tree (BST) with duplicates, find all the mode(s)
     *  (the most frequently occurred element) in the given BST.
     *  找出一个BST中出现次数最多的节点们。
     */
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        traverse(root, list);

        int[] res = new int[list.size()];
        for(int i = 0; i< res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }

    private void traverse(TreeNode root, List<Integer> list) {
        if(root == null) return;
        traverse(root.left, list);
        if(prev != null){
            if(root.val == prev){
                count++;
            }else{
                count = 1;
            }
        }
        if(count > max){
            max = count;
            list.clear();
            list.add(root.val);
        }else if(count == max){
            list.add(root.val);
        }
        prev = root.val;
        traverse(root.right, list);
    }

}
