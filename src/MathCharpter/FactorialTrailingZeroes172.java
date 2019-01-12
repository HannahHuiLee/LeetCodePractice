package MathCharpter;

/**
 * created by Hannah Li on 19/1/11
 * Project name: LeetcodeProject
 * LeetCode NO.:
 */
public class FactorialTrailingZeroes172 {


    public static void main(String[] args) {
        int s = 5;
        System.out.print(trailingZeroes(s));
    }
    /**
     * Given an integer n, return the number of trailing zeroes in n!.
     * 计算n!后面有几个0
     * Input: 3 ----> 0
     *
     * Input: 5 ----> 1
     * Explanation: 5! = 120, one trailing zero.
     *
     * 2 * 5 = 10
     * 因为我们知道0是2和5相乘得到的，而在1到n这个范围内，2的个数要远多于5的个数，所以这里只需计算从1到n这个范围内有多少个5就可以了。
     *
     * n=25  (5, 10 15, 20, 25)
     * 所以除了计算n/5， 还要计算n/5/5, n/5/5/5, n/5/5/5/5, ..., n/5/5/5,,,/5直到商为0，然后就和，就是最后的结果。
     */
    public static int trailingZeroes(int n) {
        return n / 5 == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }


}
