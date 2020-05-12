package top50;

import java.util.Arrays;
import java.util.HashMap;

/**
 * created by Hannah Li on 2020-05-11
 * Project name: LeetcodeProject
 * LeetCode NO.: 1
 */
public class TwoSum_01 {

    public static void main(String[] args) {
        TwoSum_01 res = new TwoSum_01();
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(res.twoSum(nums, 9)));
    }

    /**
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * 思路： hashmap
     *
     *  Time: O(n) --> 遍历一次
     *  Space: O(n) --> HashMap
     */
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2){
            return new int[]{-1, -1};
        }
        int[] res = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }

}
