package MathCharpter;

/**
 * created by Hannah Li on 19/1/13
 * Project name: LeetcodeProject
 * LeetCode NO.: 263
 */
public class UglyNumber263 {


    public static void main(String[] args) {
        int s = 6;
        System.out.print(isUgly(s));
    }

    /**
     * Write a program to check whether a given number is an ugly number.
     * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
     * Input: 6 ---> true
     * Explanation: 6 = 2 × 3
     */
    public static boolean isUgly(int num) {
        if(num == 1) return true;
        if(num == 0) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }
}
