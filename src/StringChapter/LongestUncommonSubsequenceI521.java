package StringChapter;

/**
 * created by Hannah Li on 19/2/1
 * Project name: LeetcodeProject
 * LeetCode NO.: 521
 */
public class LongestUncommonSubsequenceI521 {

    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "cdc";
        System.out.print(findLUSlength(s1,s2));
    }


    /**
     *Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings.
     *Input: "aba", "cdc" --》 3
     */
    public static int findLUSlength(String a, String b) {
        return a.equals(b) ? -1: Math.max(a.length(), b.length());
    }
}
