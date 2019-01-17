package MathCharpter;

/**
 * created by Hannah Li on 19/1/16
 * Project name: LeetcodeProject
 * LeetCode NO.: 415
 */
public class AddStrings415 {


    public static void main(String[] args) {
        String s1 = "5";
        String s2 = "3";
        System.out.print(addStrings(s1, s2));
    }

    /**
     * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
     * “字符串相加”，给定两个非负的由字符串表示整数，求出它们的和
     */
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        String res = "";
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            res = Integer.toString(carry % 10) + res;
            carry /= 10;
        }
        return carry != 0 ? "1" + res : res;
    }

}
