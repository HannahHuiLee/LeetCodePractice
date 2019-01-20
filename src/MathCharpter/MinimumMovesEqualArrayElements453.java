package MathCharpter;

import java.util.Arrays;

/**
 * created by Hannah Li on 19/1/18
 * Project name: LeetcodeProject
 * LeetCode NO.: 453
 */
public class MinimumMovesEqualArrayElements453 {

    public static void main(String[] args) {
        int [] num = {1,2,3};
        System.out.print(minMoves(num));
    }


    /**
     *Given a non-empty integer array of size n, find the minimum number of
     * moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.
     * 大意：给你一个数组，每次可以把其中n-1个数加1，问最少需要多少次操作可以使得数组中的元素都相等。
     *
     * Input: [1,2,3]--->3
     *        [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
     */
    public static int minMoves(int[] nums) {
        int total = 0;
        Arrays.sort(nums);
        for(int i =0; i < nums.length; i++){
            total += nums[i];
        }
        int result = total - nums[0] * nums.length;
        return result;
    }

}
