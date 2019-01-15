package MathCharpter;

/**
 * created by Hannah Li on 19/1/14
 * Project name: LeetcodeProject
 * LeetCode NO.:
 */
public class PowerofThree326 {

    public static void main(String[] args) {
        int s = 27;
        System.out.print(isPowerOfThree(s));
    }


    /**
     * Given an integer, write a function to determine if it is a power of three.
     * Input: 27--->true
     * Input: 45--->false
     */
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static boolean isPowerOfThree2(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }


}
