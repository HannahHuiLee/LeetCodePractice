package arrayChapter;

/**
 * created by Hannah Li on 18/11/10
 * Project name: LeetCode
 * LeetCode NO.: 121
 */
public class BuySellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.print(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2) return 0;

        int min = prices[0];
        int profit = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(price - min, profit);
        }

        return profit;
    }


}
