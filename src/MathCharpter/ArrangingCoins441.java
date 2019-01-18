package MathCharpter;

/**
 * created by Hannah Li on 19/1/17
 * Project name: LeetcodeProject
 * LeetCode NO.: 441
 */
public class ArrangingCoins441 {

    public static void main(String[] args) {
        int num = 5;
        System.out.print(arrangeCoins(num));
    }


    /**
     * 你有n枚硬币，想要用来组成一个完整的楼梯，每一层都要有层数对应的硬币数。给出n，返回可以组成的完整楼梯的层数。
     * input :    5 --->2
     */
    public static int arrangeCoins(int n) {
        if (n <= 1) return n;
        long left = 0;
        long right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = ((1 + mid) * mid) / 2;
            if (sum <= n) {
                left = mid + 1;
            } else {
                right = mid - 1;

            }
        }
        return (int)(left - 1);

    }

}
