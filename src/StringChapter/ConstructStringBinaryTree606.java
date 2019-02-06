package StringChapter;

/**
 * created by Hannah Li on 19/2/5
 * Project name: LeetcodeProject
 * LeetCode NO.: 606
 */
public class ConstructStringBinaryTree606 {


    public static void main(String [] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.right = node4;

        ConstructStringBinaryTree606 ct = new ConstructStringBinaryTree606();
        String s = ct.tree2str(node1);
        System.out.print(s);
    }


    /**
     *You need to construct a string consists of parenthesis and integers from
     * a binary tree with the preorder traversing way.
     *考点：先序遍历，在遍历的过程中，注意什么时候加括号，什么时候不加括号
     */
    public String tree2str(TreeNode t) {
        if(t == null) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(t.val);
        if(t.right != null){
            sb.append("(").append(tree2str(t.left)).append(")").append("(").append(tree2str(t.right)).append(")");
        }else if(t.left != null){
            sb.append("(").append(tree2str(t.left)).append(")");
        }
        return sb.toString();
    }


}
