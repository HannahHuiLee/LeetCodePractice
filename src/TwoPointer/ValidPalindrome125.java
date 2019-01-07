package TwoPointer;

/**
 * created by Hannah Li on 19/1/6
 * Project name: LeetcodeProject
 * LeetCode NO.: 125
 */
public class ValidPalindrome125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(isPalindrome2(s));
    }


    /**
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     * Note: For the purpose of this problem, we define empty string as valid palindrome.
     * Input: "A man, a plan, a canal: Panama"
     * Output: true
     */
    public static boolean isPalindrome2(String s) {
        if (s == null || s.length() == 0) return true;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
