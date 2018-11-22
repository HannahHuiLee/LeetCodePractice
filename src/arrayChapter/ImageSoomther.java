package arrayChapter;

/**
 * created by Hannah Li on 18/11/21
 * Project name: LeetcodeProject
 * LeetCode NO.: 661
 */
public class ImageSoomther {

    public static void main(String[] args) {
        int[][] nums = {{1,1,1}, {1,0,1},{1,1,1}};

    }

    /**
     * Given a 2D integer matrix M representing the gray scale of an image, you need to
     * design a smoother to make the gray scale of each cell becomes the average gray
     * scale (rounding down) of all the 8 surrounding cells and itself.
     * If a cell has less than 8 surrounding cells, then use as many as you can.
     * Input:
     * [[1,1,1],
     * [1,0,1],
     * [1,1,1]]
     * Output:
     * [[0, 0, 0],
     * [0, 0, 0],
     * [0, 0, 0]]
     * Explanation:
     * For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
     * For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
     * For the point (1,1): floor(8/9) = floor(0.88888889) = 0
     */
    public int[][] imageSmoother(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        int[][] result = new int[m][n];
        int[] range = new int[]{-1, 0, 1};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int current = 0;
                int count = 0;
                for (int a : range) {
                    for (int b : range) {
                        int row = i + a;
                        int col = j + b;
                        if (row >= 0 && row < m && col >= 0 && col < n) {
                            current += M[row][col];
                            count++;
                        }
                    }
                }
                result[i][j] = (int) Math.floor((double) current / count);
            }
        }
        return result;
    }

}
