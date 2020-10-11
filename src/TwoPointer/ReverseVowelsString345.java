package TwoPointer;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * created by Hannah Li on 19/1/6
 * Project name: LeetcodeProject
 * LeetCode NO.: 345
 */
public class ReverseVowelsString345 {

    private static final HashSet<Character> vowels =
            new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.print(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        if (s == null) return null;
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!vowels.contains(ci)){
                result[i] = ci;
                i++;
            }else if(!vowels.contains(cj)){
                result[j] = cj;
                j--;
            }else{
                result[i] = cj;
                result[j] = ci;
                i++;
                j--;
            }
        }
        return new String(result);
    }

    /**
     * Write a function that takes a string as input and reverse only the vowels of a string.
     * Input: "hello"  ----> "holle"
     * Input: "leetcode"  --->   "leotcede"
     * 大意： 反转一个字符串中的元音字母。第一个和最后一个元音字母交换，第二个和倒数第二个交换……
     * 思路： 首先定义一个方法去判断一个char字符是否是元音字母。然后通过首尾两个”指针”，
     * 当前后两个字符都是元音字符的时候才进行交换，否则将不是元音字符的指针向前或者向后移动。
     * <p>
     * 跳出条件就是start < end。
     */
    public static String reverseVowels2(String s) {
        if (s == null || s.length() == 0) return s;
        String vowels = "aeiouAEIOU";

        int start = 0;
        int end = s.length() - 1;
        char[] str = s.toCharArray();

        while (start < end) {
            while (start < end && vowels.indexOf(str[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(str[end]) == -1) {
                end--;
            }
            char temp = str[start];
            str[start++] = str[end];
            str[end--] = temp;
        }
        return String.valueOf(str);
    }

}
