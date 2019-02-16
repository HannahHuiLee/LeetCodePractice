package StringChapter;

/**
 * created by Hannah Li on 19/2/15
 * Project name: LeetcodeProject
 * LeetCode NO.: 917
 */
public class ReverseOnlyLetters917 {

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.print(reverseOnlyLetters(s));
    }

    /**
     * Given a string S, return the "reversed" string where all characters that are
     * not a letter stay in the same place, and all letters reverse their positions.
     * Input: "a-bC-dEf-ghIj"
     * Output: "j-Ih-gfE-dCba"
     */
    public static String reverseOnlyLetters(String S) {
        char[] array = S.toCharArray();
        int i = 0, j = array.length - 1;
        while (i < j && j >= 0 && i <= array.length - 1) {
            if (!isLetter(array[i])) {
                i++;
            }
            if (!isLetter(array[j])) {
                j--;
            }
            if (i <= array.length - 1 && j >= 0 && isLetter(array[i]) && isLetter(array[j])) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return new String(array);
    }

    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

}
