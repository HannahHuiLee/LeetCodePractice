package HashTableChapter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * created by Hannah Li on 18/12/12
 * Project name: LeetcodeProject
 * LeetCode NO.: 645
 */
public class SetMismatch645 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.print(Arrays.toString(findErrorNums(nums)));
    }

    /**
     * Given an array nums representing the data status of this set after the error. Your task is to firstly find
     * the number occurs twice and then find the number that is missing. Return them in the form of an array.
     * Input: nums = [1,2,2,4]
     * Output: [2,3]
     * 遍历每个数字，然后将其应该出现的位置上的数字变为其相反数，这样如果我们再变为其相反数之前已经成负数了，说明该数字是重复数，
     * 将其将入结果res中，然后再遍历原数组，如果某个位置上的数字为正数，说明该位置对应的数字没有出现过，加入res中即可
     * 6ms -- beat 80%
     */
    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        for (int i : nums) {
            if (nums[Math.abs(i) - 1] < 0) {
                res[0] = Math.abs(i);
            } else {
                nums[Math.abs(i) - 1] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res[1] = i + 1;
            }
        }
        return res;
    }


    /**
     *  23ms -- beat 32%
     */
    public static int[] findErrorNums2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0;
        int n = nums.length;
        long sum = (n * (n + 1)) / 2;
        for(int i : nums){
            if(set.contains(i)){
                duplicate = i;
            }
            sum -= i;
            set.add(i);
        }
        return new int[]{duplicate, (int)(duplicate+ sum)};
    }

}
