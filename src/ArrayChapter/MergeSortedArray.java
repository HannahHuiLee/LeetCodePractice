package arrayChapter;


import java.util.Arrays;

/**
 * created by Hannah Li on 18/11/9
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1, 3, 4, 5, 0, 0};
        int[] num2 = {7, 9};

       merge(num1,4, num2, 2);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] >= nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        System.out.print(Arrays.toString(nums1));
    }


}
