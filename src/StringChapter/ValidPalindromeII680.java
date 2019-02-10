package StringChapter;

import static StringChapter.RepeatedStringMatch686.repeatedStringMatch;

/**
 * created by Hannah Li on 19/2/9
 * Project name: LeetcodeProject
 * LeetCode NO.: 680
 */
public class ValidPalindromeII680 {

    public static void main(String[] args) {
        String s = "aba";
        System.out.print(validPalindrome(s));
    }

    /**
     * Given a non-empty string s, you may delete at most one character.
     * Judge whether you can make it a palindrome.
     * Input: "aba" --> True
     */
    public static boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1, false);
    }


    private static boolean validPalindrome(String s, int left, int right, boolean deleted) {
        while (left < right) {
            if(s.charAt(left) != s.charAt(right)){
                if(deleted){
                    return false;
                }
                return validPalindrome(s,left+1, right,true) || validPalindrome(s, left, right-1, true);
            }
            left++;
            right--;
        }
        return true;
    }


}
