package Sort;

import java.util.Arrays;

/**
 * created by Hannah Li on 2020-10-12
 * Project name: LeetcodeProject
 * LeetCode NO.: 75
 */
public class SortColors75 {

    public static void main(String[] args) {
        SortColors75 sortColors75 = new SortColors75();
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors75.sortColors(nums);
    }

    /**
     * Input: nums = [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     * 按颜色进行排序: 只有 0/1/2 三种颜色。
     */
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1, curt = 0;
        while (curt <= right){
            if(nums[curt] == 2){
                swap(nums, curt, right);
                right--;
            }else if(nums[curt] == 0){
                swap(nums, curt, left);
                left++;
                curt++;
            }else{
                curt++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
