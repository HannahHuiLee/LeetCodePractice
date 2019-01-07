package TwoPointer;

/**
 * created by Hannah Li on 19/1/6
 * Project name: LeetcodeProject
 * LeetCode NO.: 344
 */
public class ReverseString344 {


    public static void main(String[] args) {
        String s = "hello";
        System.out.print(reverseString(s));
    }


    /**
     * Write a function that takes a string as input and returns the string reversed.
     * Input: "hello" ---->    "olleh"
     */
    public static String reverseString(String s) {
        if (s == null || s.length() == 0) return s;

        int left = 0;
        int right = s.length() - 1;
        char[] str = s.toCharArray();
        while (left < right) {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
        return new String(str);
    }

}
