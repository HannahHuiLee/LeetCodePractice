package arrayChapter;

/**
 * created by Hannah Li on 18/11/24
 * Project name: LeetcodeProject
 * LeetCode NO.: 674
 */
public class LongestContinuousIncreasing674 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.print(findLengthOfLCIS(nums));

    }

    /**
     * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
     * Input: [1,3,5,4,7]
     * Output: 3
     * Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
     * Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
     */
    public static int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length <= 0) return 0;

        int current = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i-1]) {
                current++;
                max = Math.max(current, max);
            }else{
                current = 1;
            }
        }
        return max;
    }

}
