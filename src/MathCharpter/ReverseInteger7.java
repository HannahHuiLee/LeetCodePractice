package MathCharpter;

/**
 * created by Hannah Li on 19/1/7
 * Project name: LeetcodeProject
 * LeetCode NO.: 7
 */
public class ReverseInteger7 {

    public static void main(String[] args) {
        int x = -123;
        System.out.print(reverse(x));
    }

    /**
     *Given a 32-bit signed integer, reverse digits of an integer.
     * Input: 123  --->   321
     *       -123  --->   -321
     *
     *  corner case 越界
     *  int 的范围 -2147483648 ~ 2147483647
     *
     * time : O(n) space : O(1)
     */
    public static int reverse(int x) {
        long res = 0;
        while (x != 0){
            res = res * 10 + x % 10;
            x /= 10;
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int)res;
    }
}
