package ArrayChapter;

/**
 * created by Hannah Li on 2021-09-04
 * Project name: LeetcodeProject
 * LeetCode NO.: 27
 */
public class RemoveElement27 {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }

    /**
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
     *
     * Input: nums = [3,2,2,3], val = 3
     * Output: 2, nums = [2,2,_,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     *
     * 数组元素置换问题，  双指针算法
     */

    // time: O(n), space: O(1)
    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }

}
