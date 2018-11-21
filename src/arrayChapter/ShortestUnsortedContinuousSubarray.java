package arrayChapter;

import java.util.Stack;

/**
 * created by Hannah Li on 18/11/20
 * Project name: LeetcodeProject
 * LeetCode NO.: 581
 */
public class ShortestUnsortedContinuousSubarray {

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.print(findUnsortedSubarray(nums));
    }

    /**
     * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.
     * <p>
     * You need to find the shortest such subarray and output its length.
     * <p>
     * Input: [2, 6, 4, 8, 10, 9, 15]
     * Output: 5
     * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
     *
     * monotonic stack
     */
    public static int findUnsortedSubarray(int[] nums) {

        if (nums.length < 2) return 0;

        Stack<Integer> stack = new Stack<>();
        int leftBound = nums.length - 1;
        int rightBound = 0;
        for (int i = 0; i < nums.length; i++) {
            if (stack.empty() || nums[i] >= nums[stack.peek()]) {
                stack.push(i);
            } else {
                leftBound = Math.min(leftBound, stack.pop());
                i--;
            }
        }
        stack.clear();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.empty() || nums[i] <= nums[stack.peek()]) {
                stack.push(i);
            } else {
                rightBound = Math.max(rightBound, stack.pop());
                i++;
            }
        }
        return rightBound - leftBound > 0 ? rightBound - leftBound + 1 : 0;

    }

}
