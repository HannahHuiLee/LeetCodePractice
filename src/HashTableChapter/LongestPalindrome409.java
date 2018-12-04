package HashTableChapter;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

/**
 * created by Hannah Li on 18/12/4
 * Project name: LeetcodeProject
 * LeetCode NO.: 409
 */
public class LongestPalindrome409 {


    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.print(longestPalindrome1(s));
    }


    /**
     * Given a string which consists of lowercase or uppercase letters, find the length of the
     * longest palindromes that can be built with those letters.
     * Input:
     * "abccccdd"
     * Output:
     * 7
     * Explanation:
     * One longest palindrome that can be built is "dccaccd", whose length is 7.
     */

    public static int longestPalindrome1(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                result++;
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        if (!set.isEmpty()) {
            return result * 2 + 1;
        }
        return result * 2;
    }


    // 返回的值不对
    public static int longestPalindrome(String s) {
        int res = 0;
        BitSet bitSet = new BitSet(26 * 2);
        for (int i = 0; i < s.length(); i++) {
            int index = getIndex(s.charAt(i));
            bitSet.set(index, !bitSet.get(index));
            // 若为false，取反之前为true。说明第二次遇到改字母。次数+2
            if (!bitSet.get(index)) {
                res += 2;
            }
        }
        // 不为空，说明还有字母，选择一个可作为回文字符中间的值
        if (bitSet.isEmpty()) {
            res += 1;
        }
        return res;
    }

    public static int getIndex(char ch) {
        return (int) ch >= 'a' ? ch - 'a' + ('Z' - 'A') : ch - 'A';
    }


}
