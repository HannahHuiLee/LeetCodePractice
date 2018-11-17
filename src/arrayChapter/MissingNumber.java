package arrayChapter;

/**
 * created by Hannah Li on 18/11/17
 * Project name: LeetcodeProject
 * LeetCode NO.: 268
 */
public class MissingNumber {

    public static void main(String[] args){

        int[] nums = {3,0,1};
        int k = 3;

        System.out.println(missingNumber(nums));

    }

    /**
     * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
     * Input: [9,6,4,2,3,5,7,0,1]
     * Output: 8
     *
     *
     * ^ : 相同为0 不同为1
     *     0 ^ 0 = 0;
     *     b ^ b = 0;
     *     a ^ 0 = a;
     *     a ^ b ^ b = a;
     */
    public static int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i = 0; i < nums.length; i++){
            res ^= i ^ nums[i];
        }
        return res;
    }

}
