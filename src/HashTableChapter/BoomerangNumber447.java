package HashTableChapter;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Hannah Li on 18/12/6
 * Project name: LeetcodeProject
 * LeetCode NO.: 447
 */
public class BoomerangNumber447 {


    public static void main(String[] args) {
        int[][] boom = {{0,0},{1,0},{2,0}};
        System.out.print(numberOfBoomerangs(boom));
    }

    /**
     * Input:
     * [[0,0],[1,0],[2,0]]
     * <p>
     * Output:
     * 2
     * <p>
     * Explanation:
     * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
     * 用时120ms
     */
    public static int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }

            for(int val : map.values()){
                res += val*(val-1);
            }
            map.clear();
        }
        return res;
    }

    private static int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }

}
