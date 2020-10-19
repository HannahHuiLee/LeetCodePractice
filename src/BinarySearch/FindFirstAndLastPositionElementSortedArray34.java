package BinarySearch;

import java.util.Arrays;

/**
 * created by Hannah Li on 2020-10-18
 * Project name: LeetcodeProject
 * LeetCode NO.: 34
 */
public class FindFirstAndLastPositionElementSortedArray34 {

    public static void main(String[] args) {
        FindFirstAndLastPositionElementSortedArray34 find34= new FindFirstAndLastPositionElementSortedArray34();
        int[] nums = new int[]{5,7,7,8,8,10};
        System.out.println(Arrays.toString(find34.searchRange(nums, 8)));
    }

    /**
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
     */
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findFirst(nums, target + 1) - 1;
        if(first == nums.length || nums[first] != target){
            return new int[]{-1, -1};
        }else{
            return new int[]{first, Math.max(first, last)};
        }
    }

    private int findFirst(int[] nums, int target) {
        int l = 0, h = nums.length;
        while (l < h){
            int mid = l + (h-l)/2;
            if(nums[mid] >= target){
                h = mid;
            }else{
                l = mid +1;
            }
        }
        return l;
    }
}
