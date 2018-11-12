package arrayChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/11/11
 * Project name: LeetcodeProject
 * LeetCode NO.: 167
 */
public class TwoSum2 {

    public static void main(String[] args) {

        int[] prices = {2, 7, 11, 15};
        System.out.print(Arrays.toString(twoSum(prices, 9)));
    }


    /**
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
     * <p>
     * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
     * <p>
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
     */
    public static int[] twoSum(int[] numbers, int target) {

        if (numbers == null || numbers.length < 1) return null;

        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int sumNum = numbers[i] + numbers[j];
            if (sumNum > target) {
                j--;
            } else if (sumNum < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return null;
    }


}
