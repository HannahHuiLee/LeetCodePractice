package MathCharpter;

/**
 * created by Hannah Li on 19/1/9
 * Project name: LeetcodeProject
 * LeetCode NO.: 69
 */
public class Sqrt69 {

    public static void main(String[] args){
        int b = 8;
        System.out.print(mySqrt2(b));
    }

    /**
     * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
     * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
     * nput: 4
     * Output: 2
     */
    public static int mySqrt(int x) {
        if (x <= 0) return 0;
        int low = 1;
        int high = x;
        while (low <= high) {
            long mid = (high - low) / 2 + low;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        if (high * high < x) {
            return high;
        } else {
            return low;
        }
    }

    /**
     * Newton
     */
    public static int mySqrt2(int x){
        long res = x;
        while(res * res > x){
            res = (res + x/res) / 2;
        }
        return  (int)res;
    }

}
