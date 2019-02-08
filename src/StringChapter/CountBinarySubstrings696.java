package StringChapter;

/**
 * created by Hannah Li on 19/2/7
 * Project name: LeetcodeProject
 * LeetCode NO.: 696
 */
public class CountBinarySubstrings696 {


    public static void main(String[] args) {
        String s = "00110011";
        System.out.print(countBinarySubstrings(s));
    }


    /**
     * Substrings that occur multiple times are counted the number of times they occur.
     * 给你一个二进制的字符串，问有多少子串的0个数量等于1的数量。
     * Input: "00110011" --->  6
     */
    public static int countBinarySubstrings(String s) {
        int prev = 0;
        int cur = 1;
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cur++;
            } else {
                prev = cur;
                cur = 1;
            }
            if (prev >= cur) res++;
        }
        return res;
    }

}
