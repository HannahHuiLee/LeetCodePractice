package HashTableChapter;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Hannah Li on 18/12/10
 * Project name: LeetcodeProject
 * LeetCode NO.: 594
 */
public class LongHarmoniousSubsequence594 {

    public static void main(String[] args) {
        int[] boom = {1,3,2,2,5,2,3,7};
        System.out.print(findLHS(boom));
    }


    /**
     * We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.
     * Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.
     * Input: [1,3,2,2,5,2,3,7]
     * Output: 5
     * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
     * 题目大意：找一个最长子序列，要求子序列中最大值和最小值的差是1。
     * 思路：用一个map存放所有值出现的次数，对于map中的每个num，求出num和num+1出现的次数之和，找出最大值即可
     * 42ms
     */
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                result = Math.max(result, map.get(key + 1) + map.get(key));
            }
        }
        return result;
    }

}
