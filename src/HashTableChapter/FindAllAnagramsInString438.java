package HashTableChapter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Hannah Li on 18/12/5
 * Project name: LeetcodeProject
 * LeetCode NO.: 438
 */
public class FindAllAnagramsInString438 {

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.print(findAnagrams(s,p));
    }


    /**
     * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
     * Input:
     * s: "abab" p: "ab"
     * <p>
     * Output:
     * [0, 1, 2]
     * <p>
     * Explanation:
     * The substring with start index = 0 is "ab", which is an anagram of "ab".
     * The substring with start index = 1 is "ba", which is an anagram of "ab".
     * The substring with start index = 2 is "ab", which is an anagram of "ab".
     * 520ms  （不合格）
     */
    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        int sl = s.length();
        int pl = p.length();
        for (int i = 0; i <= sl - pl; i++) {
            boolean flag = true;
            String subStr = s.substring(i, i + pl);
            int[] charCnt = new int[256];
            for (int j = 0; j < subStr.length(); j++) {
                charCnt[subStr.charAt(j)]++;
            }
            for (int j = 0; j < pl; j++) {
                charCnt[p.charAt(j)]--;
            }
            for (int j = 0; j < charCnt.length; j++) {
                if (charCnt[j] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }
        return list;
    }

}
