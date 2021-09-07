package ArrayChapter;

/**
 * created by Hannah Li on 2021-09-06
 * Project name: LeetcodeProject
 * LeetCode NO.: 59
 */
public class SpiralMatrixII59 {

    public static void main(String[] args) {
        int[][] m = generateMatrix(3);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println(m[i][j]);
            }
        }
    }

    /**
     * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
     * <p>
     * time: O(n^2)  space: O(n)
     */
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        int val = 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // step 1: from left to right. row不变，col变大
            for (int i = colBegin; i <= colEnd; i++) {
                matrix[rowBegin][i] = val++;
            }
            rowBegin++;
            // step 2: from top to bottom. col不变，row变大
            for (int i = rowBegin; i <= rowEnd; i++) {
                matrix[i][colEnd] = val++;
            }
            colEnd--;
            // step 3: from right to left. row不变，col变小
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    matrix[rowEnd][i] = val++;
                }
            }
            rowEnd--;
            // step 4: from bottom to top. col不变，row变小
            if (colBegin <= rowEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    matrix[i][colBegin] = val++;
                }
            }
            colBegin++;
        }
        return matrix;
    }
}
