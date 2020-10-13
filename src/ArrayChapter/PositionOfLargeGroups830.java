package ArrayChapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by Hannah Li on 18/11/25
 * Project name: LeetcodeProject
 * LeetCode NO.: 830
 */
public class PositionOfLargeGroups830 {

    public static void main(String[] args) {
        String s = "aaa";
        System.out.print(largeGroupPositions(s));
    }

    /**
     * Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.
     * The final answer should be in lexicographic order.
     * Input: "abbxxxxzzy"
     * Output: [[3,6]]
     * Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
     * Input: "abcdddeeeeaabbbcd"
     * Output: [[3,5],[6,9],[12,14]]
     */
    public static List<List<Integer>> largeGroupPositions(String S) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (S == null || S.length() < 3) return res;

        char[] sArr = S.toCharArray();
        char curChar = sArr[0];
        int start = 0;

        for (int i = 1; i < S.length(); i++) {
            if (curChar != sArr[i]) {
                if (i - 3 >= start) {
                    res.add(new ArrayList<>(Arrays.asList(start, i - 1)));
                }
                start = i;
                curChar = sArr[i];
            } else if (i == S.length() - 1 && i - 2 >= start) {
                res.add(new ArrayList<>(Arrays.asList(start, i)));
            }
        }
        return res;
    }


    public static List<List<Integer>> largeGroupPositions2(String s) {
        List<List<Integer>> results = new ArrayList<>();
        int left = 0;
        int right = left;
        while (left < s.length()) {
            while (right < s.length() && s.charAt(left) == s.charAt(right)) {
                right++;
            }
            if (right - left >= 3) {
                results.add(new ArrayList<>(Arrays.asList(left, right - 1)));
            }
            left = right;
        }
        return results;
    }


}
