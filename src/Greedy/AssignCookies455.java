package Greedy;

import java.util.Arrays;

/**
 * created by Hannah Li on 2020-10-12
 * Project name: LeetcodeProject
 * LeetCode NO.: 455
 */
public class AssignCookies455 {

    public static void main(String[] args) {
        AssignCookies455 assignCookies455 = new AssignCookies455();
        int[] num1 = new int[]{1,2,3};
        int[] num2 = new int[]{1,1};
        System.out.println( assignCookies455.findContentChildren(num1, num2) );
    }

    /**
     * Input: g = [1,2,3], s = [1,1]
     * Output: 1
     * You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
     */
    public int findContentChildren(int[] g, int[] s) {
        if (g == null | s == null) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0, si = 0;
        while (gi < g.length && si < s.length) {
            if (g[gi] <= s[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }

}
