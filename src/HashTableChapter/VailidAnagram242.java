package HashTableChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/12/1
 * Project name: LeetcodeProject
 * LeetCode NO.: 242
 */
public class VailidAnagram242 {


    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.print(isAnagram(s,t));
    }

    /**
     * Given two strings s and t , write a function to determine if t is an anagram of s.
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Note:
     * You may assume the string contains only lowercase alphabets.
     *
     * Follow up:
     * What if the inputs contain unicode characters? How would you adapt your solution to such case?
     *
     * 1. 排序 sort：  O(logN)
     * 2. map 计数：{letter: count}: O(N)
     */
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String s1 = new String(sArr);
        String s2 = new String(tArr);

        return  s1.equals(s2);
    }

}
