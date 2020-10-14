package Greedy;

/**
 * created by Hannah Li on 2020-10-13
 * Project name: LeetcodeProject
 * LeetCode NO.: 122
 */
public class BestTimeToBuyAndSellStockII122 {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockII122 bestTimeToBuyAndSellStock122 = new BestTimeToBuyAndSellStockII122();
        int[] num = new int[]{7,1,5,3,6,4};
        System.out.println(bestTimeToBuyAndSellStock122.maxProfit(num));
    }

    /**
     * Input: [7,1,5,3,6,4]
     * Output: 7
     * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     *  可以进行多次交易，多次交易之间不能交叉进行，可以进行多次交易。
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }

}
