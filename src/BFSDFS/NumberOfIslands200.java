package BFSDFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by Hannah Li on 2021-09-04
 * Project name: LeetcodeProject
 * LeetCode NO.: 200
 */
public class NumberOfIslands200 {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},};
        System.out.println(numIslands(grid));
    }

    /**
     * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
     * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
     * <p>
     * Input: grid = [
     * ["1","1","0","0","0"],
     * ["1","1","0","0","0"],
     * ["0","0","1","0","0"],
     * ["0","0","0","1","1"]
     * ]
     * Output: 3
     * <p>
     * BFS / DFS(推荐)
     */
    public static int numIslands(char[][] grid) {
        int res = 0;
        int row = grid.length;
        if (row == 0) return 0;
        int column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, row, column);
                    res++;
                }
            }
        }
        return res;
    }

    private static void dfs(char[][] grid, int i, int j, int row, int column) {
        if (i < 0 || j < 0 || i >= row || j >= column || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(grid, i, j + 1, row, column);
        dfs(grid, i, j - 1, row, column);
        dfs(grid, i + 1, j, row, column);
        dfs(grid, i - 1, j, row, column);
    }

    public static int numIslands2(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int res = 0;
        int row = grid.length;
        int column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j, row, column);
                    res++;
                }
            }
        }
        return res;
    }

    private static void bfs(char[][] grid, int x, int y, int row, int column) {
        grid[x][y] = '0';
        Queue<Integer> queue = new LinkedList<>();
        int code = x * column + y;
        queue.offer(code);

        while (!queue.isEmpty()) {
            code = queue.poll();
            int i = code / column;
            int j = code % column;

            if (i > 0 && grid[i - 1][j] == '1') {
                queue.offer((i - 1) * column + j);
                grid[i - 1][j] = '0';
            }
            if (i < row - 1 && grid[i + 1][j] == '1') {
                queue.offer((i + 1) * column + j);
                grid[i + 1][j] = '0';
            }
            if (j > 0 && grid[i][j - 1] == '1') {
                queue.offer((i * column) + j - 1);
                grid[i][j - 1] = '0';
            }
            if (j < column - 1 && grid[i][j + 1] == '1') {
                queue.offer((i * column) + j + 1);
                grid[i][j + 1] = '0';
            }
        }
    }


}
