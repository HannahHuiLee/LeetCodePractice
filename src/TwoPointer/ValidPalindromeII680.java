package TwoPointer;

/**
 * created by Hannah Li on 2020-10-10
 * Project name: LeetcodeProject
 * LeetCode NO.: 680
 */
public class ValidPalindromeII680 {

    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }

    /**
     * Input: "abca"
     * Output: True
     * Explanation: You could delete the character 'c'.
     *
     * 可以删除一个字符，判断是否能构成回文字符串
     */
    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i<j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i, j-1) || isPalindrome(s, i+1, j);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i<j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

}
