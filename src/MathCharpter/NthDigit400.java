package MathCharpter;

/**
 * created by Hannah Li on 19/1/15
 * Project name: LeetcodeProject
 * LeetCode NO.: 400
 */
public class NthDigit400 {


    public static void main(String[] args) {
        int s = 3;
        System.out.print(findNthDigit2(s));
    }


    /**
     * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
     * input 3--->3
     * 11--->0
     * 在无限整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 中找到第n个数字。
     */
    public static int findNthDigit2(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / len;
        String s = Integer.toString(start);
        return s.charAt((n - 1) % len) - '0';
    }
}
