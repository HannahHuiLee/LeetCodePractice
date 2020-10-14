package Greedy;

/**
 * created by Hannah Li on 2020-10-13
 * Project name: LeetcodeProject
 * LeetCode NO.: 121
 */
public class BestTimeToBuyAndSellStock121 {

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock121 bestTimeToBuyAndSellStock121 = new BestTimeToBuyAndSellStock121();
        int[] num = new int[]{7,1,5,3,6,4};

        System.out.println(bestTimeToBuyAndSellStock121.maxProfit(num));

    }


    /**
     * Input: [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Not 7-1 = 6, as selling price needs to be larger than buying price.
     */
    public int maxProfit(int[] prices) {
        if (prices == null) return 0;
        int sMin = prices[0];
        int pMax = 0;
        for (int i = 1; i < prices.length - 1; i++) {
            if(sMin > prices[i]){
                sMin = prices[i];
            }else{
                pMax = Math.max(pMax, prices[i] - sMin);
            }
        }
        return pMax;


    }

}
