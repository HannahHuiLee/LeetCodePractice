package HashTableChapter;

/**
 * created by Hannah Li on 18/12/7
 * Project name: LeetcodeProject
 * LeetCode NO.: 463
 */
public class IslandPerimeter463 {

    public static void main(String[] args) {
        int[][] boom = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.print(islandPerimeter(boom));
    }

    /**
     *You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
     *Input:
     * [[0,1,0,0],
     *  [1,1,1,0],
     *  [0,1,0,0],
     *  [1,1,0,0]]
     *
     * Output: 16
     *
     * Explanation: The perimeter is the 16 yellow stripes in the image below:
     */
    public static int islandPerimeter(int[][] grid) {

        int sum = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    // top and bottom
                    if(i == 0) sum++;
                    if(i == grid.length-1) sum++;

                    // top and down
                    if(i>0 && grid[i-1][j]==0) sum++;
                    if(i < grid.length-1 && grid[i+1][j]==0) sum++;

                    // left and right
                    if(j >0 && grid[i][j-1]==0) sum++;
                    if(j < grid.length -1 && grid[i][j+1]==0) sum++;

                    if(j ==0) sum++;
                    if(j == grid[0].length -1) sum++;
                }
            }
        }
        return sum;
    }


    // 137m 太慢
    public static int islandPerimeter2(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sum =0;
        for(int i = 0; i< row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] == 1){
                    sum+=4;
                    if(i >= 1 && grid[i-1][j] ==1) sum-=2;
                    if(j >= 1 && grid[i][j-1] == 1) sum-=2;
                }
            }
        }
        return sum;
    }

}
