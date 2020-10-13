package arrayChapter;

import java.util.HashMap;

/**
 * created by Hannah Li on 18/11/17
 * Project name: LeetcodeProject
 * LeetCode NO.: 219
 */
public class ContainsDepulacate2 {

    public static void main(String[] args){

        int[] nums = {1,2,3,1};
        int k = 3;

        System.out.println(containsNearbyDuplicate(nums,k));

    }

    /**
     * Input: nums = [1,2,3,1], k = 3
     * Output: true
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int current = nums[i];

            if(map.containsKey(current) && (i - map.get(current) <= k)){
                return true;
            }else{
                map.put(current, i);
            }
        }
        return false;
    }

}
