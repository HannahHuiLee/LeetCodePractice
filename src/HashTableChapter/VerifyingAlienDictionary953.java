package HashTableChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/12/20
 * Project name: LeetcodeProject
 * LeetCode NO.: 953
 */
public class VerifyingAlienDictionary953 {


    public static void main(String[] args) {
        String[] a = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.print(isAlienSorted(a, order));
    }



    /**
     * Given a sequence of words written in the alien language, and the order of the alphabet,
     * return true if and only if the given words are sorted lexicographicaly in this alien language.
     * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
     * Output: true
     * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
     * 题目给出的所有字符都是小写字符，给了一个新的字母表顺序，问，给出的words数组，是不是有序的
     * 7ms - 45%
     */
    public static boolean isAlienSorted(String[] words, String order) {
        if(words.length == 1) return true;
        int[] pos = new int[26];
        for(char c = 'a'; c <= 'z'; ++c) {
            pos[c - 'a'] = order.indexOf(c);
        }
        for(int i = 1; i < words.length; ++i) {
            if(!check(words[i-1], words[i], pos)) return false;
        }
        return true;
    }

    private static boolean check(String s1, String s2, int[] pos) {
        int N1 = s1.length(), N2 = s2.length();
        for(int i = 0; i < Math.min(N1, N2); ++i) {
            int o1 = pos[s1.charAt(i) - 'a'], o2 = pos[s2.charAt(i) - 'a'];
            if( o1 > o2 ) {
                return false;
            } else if(o2 > o1) {
                return true;
            }
        }

        return N2 >= N1;
    }

}
