package HashTableChapter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * created by Hannah Li on 18/12/2
 * Project name: LeetcodeProject
 * LeetCode NO.: 349
 */
public class IntersectionTwoArraysI349 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        System.out.print(Arrays.toString(intersection3(nums1, nums2)));
    }


    /**
     * 交集
     * Given two arrays, write a function to compute their intersection.
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2]
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [9,4]
     */
    // 用时5s
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;

        Set<Integer> num1Set = new HashSet<>();
        for (int num1 : nums1) {
            num1Set.add(num1);
        }

        Set<Integer> interSet = new HashSet<>();
        for (int num2 : nums2) {
            if (num1Set.contains(num2)) {
                interSet.add(num2);
            }
        }

        int[] intersection = new int[interSet.size()];
        int i = 0;
        for(int inter: interSet){
            intersection[i++] = inter;
        }
        return intersection;

    }

    // 用时6s
    public static int[] intersection2(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;

        Set<Integer> num1Set = new HashSet<>();
        for (int num1 : nums1) {
            num1Set.add(num1);
        }

        Set<Integer> interSet = new HashSet<>();
        for (int num2 : nums2) {
            if (num1Set.contains(num2)) {
                interSet.add(num2);
            }
        }

        int[] intersection = new int[interSet.size()];
        Iterator<Integer> iterator = interSet.iterator();
        for(int i = 0; i< interSet.size(); i++){
            intersection[i] = iterator.next();
        }
        return intersection;
    }


    // 不推荐，太慢 77s
    public static int[] intersection3(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;

        Set<Integer> num1Set = new HashSet<>();
        for (int num1 : nums1) {
            num1Set.add(num1);
        }

        Set<Integer> finalSet = new HashSet<>();
        for (int num2 : nums2) {
            if (num1Set.contains(num2)) {
                finalSet.add(num2);
            }
        }

        return finalSet.stream().mapToInt(Integer::intValue).toArray();

    }

}
