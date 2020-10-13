package arrayChapter;

/**
 * created by Hannah Li on 18/11/19
 * Project name: LeetcodeProject
 * LeetCode NO.: 566
 */
public class ReshapeMatrix {

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        matrixReshape(nums,1,4);
    }

    /**
     * Input:  nums = [[1,2],[3,4]]
     * r = 1, c = 4
     * Output: [[1,2,3,4]]
     * Explanation: The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix,
     * fill it row by row by using the previous list.
     * <p>
     * Input:  nums =[[1,2],[3,4]]
     * r = 2, c = 4
     * Output: [[1,2],[3,4]]
     * Explanation: There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
     */
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int k = 0;
        int[] temp = new int[r * c];
        int[][] res = new int[r][c];

        if ((r * c) != (nums.length * nums[0].length)) {
            return nums;
        }
        for(int i = 0; i<nums.length; i++){
            for(int j= 0; j<nums[0].length; j++){
                temp[k] = nums[i][j];
                k++;
            }
        }

        int m = 0;
        for(int i =0; i < r; i++){
            for(int j = 0; j<c; j++){
                res[i][j] = temp[m];
                m++;
                System.out.print(res[i][j]);
            }
        }

        return res;
    }

}
