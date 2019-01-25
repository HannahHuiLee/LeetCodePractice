package MathCharpter;

/**
 * created by Hannah Li on 19/1/24
 * Project name: LeetcodeProject
 * LeetCode NO.: 812
 */
public class LargestTriangleArea812 {

    public static void main(String[] args) {
        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        System.out.print(largestTriangleArea(points));
    }


    /**
     * You have a list of points in the plane. Return the area of the largest triangle that can be formed by any 3 of the points.
     * Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]  --->   2
     * 遍历求三边的长度，当满足三角形的三遍关系时，用海伦公式求得面积，最后return面积的最大值
     * http://www.cnblogs.com/grandyang/p/9461484.html    参见公式
     */
    public static double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int i = 0; i < points.length; ++i) {
            for (int j = i + 1; j < points.length; ++j) {
                for (int k = j + 1; k < points.length; ++k) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    double area = Math.abs(0.5 * (x2 * y3 + x1 * y2 + x3 * y1 - x3 * y2 - x2 * y1 - x1 * y3));
                    res = Math.max(res, area);
                }
            }
        }
        return res;
    }
}
