package ArrayChapter;

/**
 * created by Hannah Li on 18/11/21
 * Project name: LeetcodeProject
 * LeetCode NO.: 643
 */
public class MaximumAverageSubarray {


    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.print(findMaxAverage(nums, 4));
    }

    /**
     * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
     * And you need to output the maximum average value.
     * Input: [1,12,-5,-6,50,3], k = 4
     * Output: 12.75
     * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
     */
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += (nums[i] - nums[i - k]);
            max = Math.max(sum, max);
        }
        return max * 1.0 / k;
    }


}
