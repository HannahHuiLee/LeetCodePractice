package arrayChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/11/16
 * Project name: LeetcodeProject
 * LeetCode NO.: 189
 */
public class RotateArray {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6,7};
        int num = 3;

        rotate(nums, num);
    }


    /**
     *
     * Input: [1,2,3,4,5,6,7] and k = 3
     * Output: [5,6,7,1,2,3,4]
     *
     * (0+3) % 7 =
     *
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     *
     */
    public static void rotate(int[] nums, int k) {

        int[] temp = new int[nums.length];

        for(int i = 0; i< nums.length;i++){
            temp[(i+k) % nums.length] = nums[i];
        }

        for(int i = 0; i< nums.length; i++){
            nums[i] = temp[i];
        }

        System.out.println(Arrays.toString(nums));
    }

}
