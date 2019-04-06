package InterviewList;

/**
 * created by Hannah Li on 19/4/6
 * Project name: LeetcodeProject
 * LeetCode NO.:
 */
public class Palindrome {

    public static boolean isPalindrome(String word) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        int left = 0;
        int right  = word.length() -1;
        word = word.toLowerCase();
        while (left <= right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));

    }

}
