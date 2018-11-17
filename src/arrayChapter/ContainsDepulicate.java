package arrayChapter;

import java.util.HashSet;

/**
 * created by Hannah Li on 18/11/17
 * Project name: LeetcodeProject
 * LeetCode NO.: 217
 */
public class ContainsDepulicate {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,4,7};

        System.out.println(containsDuplicate(nums));

    }


    /**
     * Input: [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }


}
