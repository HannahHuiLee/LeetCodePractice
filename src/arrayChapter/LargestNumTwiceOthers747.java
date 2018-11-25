package arrayChapter;

/**
 * created by Hannah Li on 18/11/25
 * Project name: LeetcodeProject
 * LeetCode NO.: 747
 */
public class LargestNumTwiceOthers747 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.print(dominantIndex(nums));
    }

    /**
     * In a given integer array nums, there is always exactly one largest element.
     * <p>
     * Find whether the largest element in the array is at least twice as much as every other number in the array.
     * <p>
     * If it is, return the index of the largest element, otherwise return -1.
     * Input: nums = [3, 6, 1, 0]
     * Output: 1
     * Explanation: 6 is the largest integer, and for every other number in the array x,
     * 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
     * <p>
     * Input: nums = [1, 2, 3, 4]
     * Output: -1
     * Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
     * 思路： 找到数组中最大的值和第二大的值
     */
    public static int dominantIndex(int[] nums) {
        if (nums == null || nums.length <= 0) return -1;
        int first = 0;
        int second = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        if (first >= second * 2) {
            return index;
        }else{
            return -1;
        }

    }
}
