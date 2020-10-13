package Top50;

import java.util.HashMap;
import java.util.HashSet;

/**
 * created by Hannah Li on 2020-05-13
 * Project name: LeetcodeProject
 * LeetCode NO.: 3 - medium
 */
public class LongestSubstringWithoutRepeatingCharacters_03 {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters_03 str = new LongestSubstringWithoutRepeatingCharacters_03();
        System.out.println(str.lengthOfLongestSubstring2("au"));
    }

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * <p>
     * a b c a b c b b
     * i: index 0 1 2 3...
     * j: not repeat index. j = 0   4
     * <p>
     * Time: O(n)
     * Space: O(n)
     * 思路： HashSet + HashMap
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {  // when i = 3 repeat
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);    // j = 0   1
            }
            map.put(s.charAt(i), i);    // i = 0 1 2 3 3; j = 0 0 0 1
            res = Math.max(res, i - j + 1); // 1 2 3 3 3
        }
        return res;
    }

    // question for-loop don't have condition
    public int lengthOfLongestSubstring2(String s) {
        int res = 0;
        if (s == null || s.length() == 0) return res;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0, j = 0; i < s.length(); ) { // 空语句
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j++));
            } else {
                set.add(s.charAt(i++));
                res = Math.max(res, set.size());
            }
        }
        return res;
    }


}
