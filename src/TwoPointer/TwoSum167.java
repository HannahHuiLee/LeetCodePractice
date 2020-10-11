package TwoPointer;

import java.util.Arrays;

/**
 * created by Hannah Li on 2020-10-10
 * Project name: LeetcodeProject
 * LeetCode NO.: 167
 */
public class TwoSum167 {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        TwoSum167 twoSum167 = new TwoSum167();
        System.out.println(Arrays.toString(twoSum167.twoSum(numbers, 13)));
    }

    /**
     * Given an array of integers that is already sorted in ascending order,
     * find two numbers such that they add up to a specific target number.
     * <p>
     * The function twoSum should return indices of the two numbers such that they add up to the target,
     * where index1 must be less than index2.
     * <p>
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
     */
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            if (sum < target) left++;
            if (sum > target) right--;
        }
        return null;
    }

}
