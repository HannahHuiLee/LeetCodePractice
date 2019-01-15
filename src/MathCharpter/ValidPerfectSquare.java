package MathCharpter;

/**
 * created by Hannah Li on 19/1/14
 * Project name: LeetcodeProject
 * LeetCode NO.: 367
 */
public class ValidPerfectSquare {

    public static void main(String[] args) {
        int s = 16;
        System.out.print(isPerfectSquare(s));
    }


    /**
     * Given a positive integer num, write a function which returns True if num is a perfect square else False.
     * Input: 16--> true
     * 题目：判断一个数是否是平方数。不能使用开根号函数
     * 思路：Binary search
     */
    public static boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while (low <= high) {
            long mid = (high - low) / 2 + low;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int)mid+1;
            }else {
                high  = (int)mid -1;
            }
        }
        return false;
    }
}
