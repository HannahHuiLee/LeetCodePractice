package ArrayChapter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * created by Hannah Li on 18/11/14
 * Project name: LeetcodeProject
 * LeetCode NO.: 169
 */
public class MajorityElement {

    public static void main(String[] args) {

        MajorityElement element = new MajorityElement();
        int[] num = {2,2,1,1,1,2,2};
//        element.majorityElement2(num);
        System.out.print(element.majorityElement2(num));
    }


    /**
     * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
     * <p>
     * Input: [2,2,1,1,1,2,2]
     * Output: 2
     */

    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }


    public int majorityElement2(int[] nums) {
        if (nums == null || nums.length <= 0) return -1;

        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > nums.length / 2) {
                res = num;
                break;
            }
        }
        return res;
    }


}
