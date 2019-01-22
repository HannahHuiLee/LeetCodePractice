package MathCharpter;

/**
 * created by Hannah Li on 19/1/21
 * Project name: LeetcodeProject
 * LeetCode NO.: 633
 */
public class SumSquareNumbers {

    public static void main(String[] args) {
        int m = 5;
        System.out.print(judgeSquareSum(m));
    }


    /**
     * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
     * Input: 5 -->  True
     * Explanation: 1 * 1 + 2 * 2 = 5
     * 给一个数问它是否是整数的平方和。
     */

    public static boolean judgeSquareSum(int c) {
        int low = 0;
        int high = (int) Math.sqrt(c);
        while (low <= high) {
            int sum = low * low + high * high;
            if (sum < c) {
                low++;
            } else if (sum > c) {
                high--;
            } else {
                return true;
            }
        }
        return false;
    }


    /*Time Limit Exceeded*/
    public static boolean judgeSquareSum2(int c) {

        for (int i = 0; i <= c; i++) {
            for (int j = 0; j <= c; j++) {
                if (i * i + j * j == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
