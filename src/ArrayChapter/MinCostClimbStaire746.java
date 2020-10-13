package arrayChapter;

/**
 * created by Hannah Li on 18/11/25
 * Project name: LeetcodeProject
 * LeetCode NO.: 746
 */
public class MinCostClimbStaire746 {

    public static void main(String[] args) {
        int[] nums = {10, 15, 20};
        System.out.print(minCostClimbingStairs(nums));
    }

    /**
     * On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
     * Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach
     * the top of the floor, and you can either start from the step with index 0, or the step with index 1.
     * Input: cost = [10, 15, 20]
     * Output: 15
     * Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
     *
     * @param cost 每一步所花费的值
     * @return 到达顶部总共需要的值
     */
    public static int minCostClimbingStairs(int[] cost) {
        int length = cost.length + 1;
        int dp0 = 0;
        int dp1 = 0;
        int dp2 = 0;
        for (int i = 2; i < length; i++) {
            dp2 = Math.min(dp0 + cost[i - 2], dp1 + cost[i - 1]);
            dp0 = dp1;
            dp1 = dp2;
        }
        return dp2;
    }

}
