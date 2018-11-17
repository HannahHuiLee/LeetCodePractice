package arrayChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/11/17
 * Project name: LeetcodeProject
 * LeetCode NO.: 283
 */
public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        int k = 3;

        moveZeroes(nums);

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
                nums[index++] = nums[i];
            }
        }
        while(index < nums.length){
            nums[index++] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }

}
