package MathCharpter;

/**
 * created by Hannah Li on 19/1/7
 * Project name: LeetcodeProject
 * LeetCode NO.: 9
 */
public class PalindromeNumber9 {

    public static void main(String[] args) {
        int x = 121;
        System.out.print(isPalindrome(x));
    }

    /**
     * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
     * Input: -121 ---> 121-      false
     *         121 ---> 121       true
     * time : O(n) space : O(1)
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0) return false;
        int parlind = x;
        int reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return parlind == reverse;
    }

}
