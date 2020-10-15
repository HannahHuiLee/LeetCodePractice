package Greedy;

import ArrayChapter.MaximumSubarray;

/**
 * created by Hannah Li on 2020-10-14
 * Project name: LeetcodeProject
 * LeetCode NO.: 53
 */
public class MaximumSubarray53 {

    public static void main(String[] args) {
        MaximumSubarray53 maximumSubarray53 = new MaximumSubarray53();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray53.maxSubArray(nums));
    }

    /**
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * 子数组最大的和
     */
    public int maxSubArray(int[] nums) {
        if (nums == null && nums.length == 0) return 0;
        int preSum = nums[0];
        int maxSum = preSum;
        for (int i = 1;i< nums.length;i++){
            preSum = preSum >0 ? preSum + nums[i] : nums[i];
            maxSum = Math.max(preSum, maxSum);
        }
        return maxSum;
    }
}
