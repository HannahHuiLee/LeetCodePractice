package ArrayChapter;

/**
 * created by Hannah Li on 18/11/18
 * Project name: LeetcodeProject
 * LeetCode NO.: 414
 */
public class ThirdMaximumNumber {


    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 1};

        System.out.println(thirdMax(nums));
    }


    /**
     * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
     * Input: [3, 2, 1]
     * <p>
     * Output: 1
     * <p>
     * Explanation: The third maximum is 1.
     */
    public static int thirdMax(int[] nums) {

        int first = nums[0];
        int second = nums[0];
        int third = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] != first && (nums[i] > second || second == first)) {
                third = second;
                second = nums[i];
            } else if ((nums[i] != first && nums[i] != second) && (nums[i] > third || third == first || third == second)) {
                third = nums[i];
            }
        }

        if (first > second && second > third) {
            return third;
        } else {
            return first;
        }

    }


}
