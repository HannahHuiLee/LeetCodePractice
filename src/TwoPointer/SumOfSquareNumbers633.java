package TwoPointer;

/**
 * created by Hannah Li on 2020-10-10
 * Project name: Leetcode Project
 * LeetCode NO.: 633
 */
public class SumOfSquareNumbers633 {

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(3));
    }

    /**
     * 判断一个非负整数是否为两个整数的平方和。
     * <p>
     * 本题的关键是右指针的初始化，实现剪枝，从而降低时间复杂度。设右指针为 x，左指针固定为 0，为了使 02 + x2 的值尽可能接近 target，
     * 我们可以将 x 取为 sqrt(target)。
     * Input: c = 5
     * Output: true
     * Explanation: 1 * 1 + 2 * 2 = 5
     */
    public static boolean judgeSquareSum(int target) {
        if (target < 0) return false;
        int i = 0, j = (int) Math.sqrt(target);
        while (i < j) {
            int powSum = i * i + j * j;
            if (powSum == target) {
                return true;
            } else if (powSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
