package BinarySearch;

/**
 * created by Hannah Li on 19/3/30
 * Project name: LeetcodeProject
 * LeetCode NO.: 704
 */
public class BinarySearch704 {

    /**
     * Given a sorted (in ascending order) integer array nums of n elements and a target value,
     * write a function to search target in nums. If target exists, then return its index, otherwise return -1.
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     * Explanation: 9 exists in nums and its index is 4
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left += 1;
            }else if(nums[mid] > target){
                right -= 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
