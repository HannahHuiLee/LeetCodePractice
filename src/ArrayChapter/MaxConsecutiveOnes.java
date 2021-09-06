package ArrayChapter;

/**
 * created by Hannah Li on 18/11/18
 * Project name: LeetcodeProject
 * LeetCode NO.: 485
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes2(nums));
    }

    /**
     * Given a binary array, find the maximum number of consecutive 1s in this array.
     *
     * Example 1:
     * Input: [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s.
     *              The maximum number of consecutive 1s is 3.
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length<=0) return 0;

        int localMax = 0 ;
        int globalMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                localMax++;
                globalMax = Math.max(globalMax, localMax);
            }else{
                localMax = 0;
            }
        }
        return globalMax;
    }

    public static int findMaxConsecutiveOnes2(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0, result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
            }else{
                result = Math.max(result, count);
                count= 0;
            }
        }
        return Math.max(result, count);
    }

}
