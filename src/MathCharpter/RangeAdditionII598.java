package MathCharpter;

/**
 * created by Hannah Li on 19/1/20
 * Project name: LeetcodeProject
 * LeetCode NO.: 598
 */
public class RangeAdditionII598 {

    public static void main(String[] args) {
        int m = 3, n = 3;
        int [][] num = {{2,2},{3,3}};
        System.out.print(maxCount(m, n, num));
    }


    /**
     *Given an m * n matrix M initialized with all 0's and several update operations.
     * 给一个m*n的全0矩阵和一些更新操作。每个操作用两个数字a,b组成的二维数组来表示，操作定义为对矩阵所有下标满足0 <= i < a 和 0 <= j < b的元素+1。
     * 求经过一系列操作后，矩阵中最大的元素有多少个。
     *
     * m = 3, n = 3
     * operations = [[2,2],[3,3]]
     * Output: 4
     * 思路：求行和列下标的最小值即可。因为+1操作的范围是0 <= i < a 和 0 <= j < b，所以求交集的话找最小值即可。
     *
     * 求ops[0 .. len][0]和ops[0 .. len][1]的最小值，
     * 矩阵越靠近左上角的元素值越大，因为要加1的元素 行和列索引是从0开始的。
     * 那么只需要找到操作次数最多的元素位置即可。而操作次数最多的元素肯定是偏向于靠近矩阵左上角的。
     */
    public static int maxCount(int m, int n, int[][] ops) {
        int row = m;
        int col = n;
        for(int[] op : ops){
            row = Math.min(row, op[0]); // 横坐标op[0]
            col = Math.min(col, op[1]); // 纵坐标op[1]
        }
        return row * col; // row * col是左上角的元素个数
    }

}
