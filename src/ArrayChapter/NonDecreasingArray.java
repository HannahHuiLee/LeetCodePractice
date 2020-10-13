package ArrayChapter;

/**
 * created by Hannah Li on 18/11/23
 * Project name: LeetcodeProject
 * LeetCode NO.: 665
 */
public class NonDecreasingArray {

    public static void main(String[] args) {
        int[] nums = {4,2,3};
        System.out.print(checkPossibility(nums));

    }

    /**
     * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
     * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
     * Input: [4,2,3]
     * Output: True
     * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
     */
    public static boolean checkPossibility(int[] nums) {

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }

            }
        }
        return true;
    }
}
