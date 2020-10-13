package ArrayChapter;

/**
 * created by Hannah Li on 18/11/20
 * Project name: LeetcodeProject
 * LeetCode NO.: 628
 */
public class MaximumOfThreeNumbers {


    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.print(maximumProduct(nums));
    }

    /**
     * Given an integer array, find three numbers whose product is maximum and output the maximum product.
     * <p>
     * Input: [1,2,3]
     * Output: 6
     * Input: [1,2,3,4]
     * Output: 24
     */
    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);


    }


}
