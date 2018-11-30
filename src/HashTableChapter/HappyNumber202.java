package HashTableChapter;

import java.util.HashSet;

/**
 * created by Hannah Li on 18/11/30
 * Project name: LeetcodeProject
 * LeetCode NO.: 202
 */
public class HappyNumber202 {


    public static void main(String[] args) {
        int[] numbs1 = {4, 1, 2, 1, 2};
        System.out.print(isHappy(19));
    }


    /**
     * A happy number is a number defined by the following process:
     * Starting with any positive integer, replace the number by the sum of the squares of its digits,
     * and repeat the process until the number equals 1 (where it will stay),
     * or it loops endlessly in a cycle which does not include
     * 1. Those numbers for which this process ends in 1 are happy numbers.
     * Input: 19
     * Output: true
     * Explanation:
     * 12 + 92 = 82
     * 82 + 22 = 68
     * 62 + 82 = 100
     * 12 + 02 + 02 = 1
     */
    public static boolean isHappy(int n) {
        if (n < 1) return false;
        HashSet<Integer> set = new HashSet<>();

        int temp;
        int newN;
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            newN = 0;
            while (n > 0) {
                temp = n % 10; // 9
                n = n / 10;   //  1
                newN += temp * temp;  // 9*9
            }
            n = newN;
        }
        return n == 1;
    }


}
