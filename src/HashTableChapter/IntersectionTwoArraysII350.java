package HashTableChapter;

import java.util.*;

/**
 * created by Hannah Li on 18/12/2
 * Project name: LeetcodeProject
 * LeetCode NO.: 350
 */
public class IntersectionTwoArraysII350 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        System.out.print(Arrays.toString(intersect(nums1, nums2)));
    }


    /**
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * 交集，出现多次需要显示多次
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;

        Map<Integer, Integer> num1Map = new HashMap<>();
        for (int num : nums1) {
            num1Map.put(num, num1Map.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (num1Map.containsKey(num)&& num1Map.get(num) != 0) {
                result.add(num);
                num1Map.put(num, num1Map.get(num)-1);
            }
        }

        int[] resultArr = new int[result.size()];
        int i = 0;
        for (int num : result) {
            resultArr[i++] = num;
        }
        return resultArr;
    }

}
