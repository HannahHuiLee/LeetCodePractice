package arrayChapter;

/**
 * created by Hannah Li on 18/11/11
 * Project name: LeetcodeProject
 * LeetCode NO.: 122
 */
public class BuySellStock2 {


    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.print(maxProfit(prices));

    }

    /**
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * <p>
     * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
     * <p>
     * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
     * <p>
     * Input: [7,1,5,3,6,4]
     * Output: 7
     * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     */
    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length <= 1) return 0;

        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int current = prices[i];
            int previous = prices[i-1];
            if(current > previous) sum += (current - previous);
        }
        return sum;

    }


}
