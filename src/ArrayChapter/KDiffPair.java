package ArrayChapter;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Hannah Li on 18/11/18
 * Project name: LeetcodeProject
 * LeetCode NO.: 532
 */
public class KDiffPair {

    public static void main(String[] args) {

        int[] nums = {1,3,1,5,4};
        int k= 0;

        System.out.println(findPairs(nums,k));
    }

    /**
     * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
     * Here a k-diff pair is defined as an integer pair (i, j),
     * where i and j are both numbers in the array and their absolute difference is k.
     *
     * Input: [3, 1, 4, 1, 5], k = 2
     * Output: 2
     * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
     *              Although we have two 1s in the input, we should only return the number of unique pairs.
     */
    public static int findPairs1(int[] nums, int k) {
        if(nums == null || nums.length ==0 || k<0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        int res = 0;
        for(int i = 0;i<nums.length; i++){
            // map.get(nums[i] + k) != i避免nums[i] + k也在nums.length之内的情况
            if(map.containsKey(nums[i]+k) && map.get(nums[i]+k) != i){
                map.remove(nums[i]+k);
                res++;
            }
        }
        return res;
    }



    public static int findPairs(int[] nums, int k) {
        if(nums == null || nums.length ==0 || k<0) return 0;

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(k == 0){
                if(entry.getValue() >= 2){
                    count++;
                }
            }else{
                if(map.containsKey(entry.getKey()+k)){
                    count++;
                }
            }
        }
        return count;
    }
}
