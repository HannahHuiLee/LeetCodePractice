package ArrayChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/11/17
 * Project name: LeetcodeProject
 * LeetCode NO.: 283
 */
public class MoveZeroes283 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes1(nums);
    }

    /**
     * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Input: [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     */
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    // time complexity - O(n) ;   space complexity - O(1)
    public static void moveZeroes1(int[] nums){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = 0;
                nums[i] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
