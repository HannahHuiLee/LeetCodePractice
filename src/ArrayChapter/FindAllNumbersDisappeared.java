package ArrayChapter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Hannah Li on 18/11/18
 * Project name: LeetcodeProject
 * LeetCode NO.: 448
 */
public class FindAllNumbersDisappeared {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums).toString());
    }


    /**
     * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
     * Find all the elements of [1, n] inclusive that do not appear in this array.
     * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
     * https://www.jianshu.com/p/38ce86dc635a
     * Input:  [4,3,2,7,8,2,3,1]
     * Output: [5,6]
     *
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        for(int i = 0; i< nums.length; i++){   // i = 0,1,2,3,4,5,6,7
            int index = Math.abs(nums[i]) - 1; // index = 3, 2, 6, 7, 1, 2, 0

            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            if(nums[i]> 0){
                result.add(i +1);
            }
        }

        return result;
    }


}
