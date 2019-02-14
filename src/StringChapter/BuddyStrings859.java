package StringChapter;

/**
 * created by Hannah Li on 19/2/13
 * Project name: LeetcodeProject
 * LeetCode NO.: 859
 */
public class BuddyStrings859 {


    public static void main(String[] args) {
        String a = "ab", b = "ba";
        System.out.print(buddyStrings2(a, b));
    }

    /**
     * Given two strings A and B of lowercase letters,
     *  return true if and only if we can swap two letters in A so that the result equals B.
     *
     *  Input: A = "ab", B = "ba"--->true
     * */
    public static boolean buddyStrings2(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.length() == 0) {
            return false;
        }
        char a = ' ', b = ' ';
        int diff = 0;
        int[] count = new int[128];
        boolean isDup = false;
        for (int i = 0; i < A.length(); i++) {
            if (count[A.charAt(i)]++ > 0) {
                isDup = true;
            }
            if (A.charAt(i) != B.charAt(i)) {
                if (diff == 0) {
                    a = A.charAt(i);
                    b = B.charAt(i);
                } else if (diff == 1) {
                    if (a != B.charAt(i) || b != A.charAt(i)) {
                        return false;
                    }
                } else {
                    return false;
                }
                diff++;
            }
        }
        return diff == 2 || diff == 0 && isDup;
    }

}
