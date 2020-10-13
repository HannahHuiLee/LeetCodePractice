package ArrayChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/11/19
 * Project name: LeetcodeProject
 * LeetCode NO.: 561
 */
public class ArrayPartition {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1};
        System.out.println(arrayPairSum(nums));
    }


    /**
     * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
     * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
     * <p>
     * Input: [1,4,3,2]
     * Output: 4
     * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
     */
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // 1,2,3,4
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }

}
