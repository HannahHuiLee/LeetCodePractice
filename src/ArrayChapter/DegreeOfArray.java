package ArrayChapter;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Hannah Li on 18/11/24
 * Project name: LeetcodeProject
 * LeetCode NO.: 697
 */
public class DegreeOfArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.print(findShortestSubArray(nums));

    }

    /**
     * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
     * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
     * Input: [1, 2, 2, 3, 1]
     * Output: 2
     * Explanation:
     * The input array has a degree of 2 because both elements 1 and 2 appear twice.
     * Of the subarrays that have the same degree:
     * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
     * The shortest length is 2. So return 2.
     * <p>
     * Input: [1,2,2,3,1,4,2]
     * Output: 6
     */
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        Map<Integer, Integer> starts = new HashMap<>();
        Map<Integer, Integer> ends = new HashMap<>();
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!counts.containsKey(num)) {
                starts.put(num, i);
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
            ends.put(num, i);
            maxCount = Math.max(maxCount, counts.get(num));
        }
        int result = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == maxCount) {
                result = Math.min(result, ends.get(entry.getKey()) - starts.get(entry.getKey()) + 1);
            }
        }
        return result;
    }

}
