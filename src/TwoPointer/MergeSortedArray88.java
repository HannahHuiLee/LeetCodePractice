package TwoPointer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * created by Hannah Li on 2020-10-11
 * Project name: LeetcodeProject
 * LeetCode NO.: 88
 */
public class MergeSortedArray88 {

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 6, 0, 0, 0};
        int[] num2 = new int[]{2, 3, 5};
//        merge(num1, 3, num2, 3);
        merge2(num1, 3, num2, 3);
    }

    private static void merge2(int[] num1, int m, int[] num2, int n) {
        int end = m + n - 1;
        while (m - 1 >= 0 && n - 1 >= 0) {
            int x = m - 1 > 0 ? num1[m - 1] : Integer.MIN_VALUE;
            int y = n - 1 > 0 ? num2[n - 1] : Integer.MIN_VALUE;

            if(x > y){
                num1[end--] = x;
                m--;
            }else {
                num1[end--] = y;
                n--;
            }
        }
    }

    /**
     * Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * Output: [1,2,2,3,5,6]
     * 把归并结果存到第一个数组上
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        int indexMerge = m + n - 1;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) {
                nums1[indexMerge--] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[indexMerge--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[indexMerge--] = nums1[index1--];
            } else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }

}
