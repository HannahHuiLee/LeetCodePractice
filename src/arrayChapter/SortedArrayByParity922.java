package arrayChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/11/29
 * Project name: LeetcodeProject
 * LeetCode NO.: 922
 */
public class SortedArrayByParity922 {

    public static void main(String[] args) {
        int[] numbs1 = {4,2,5,7};
        System.out.print(Arrays.toString(sortArrayByParityII(numbs1)));
    }


    /**
     * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
     * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
     * You may return any answer array that satisfies this condition.
     * 下标为偶数对应的值也为偶数。奇数同理
     * Input: [4,2,5,7]
     * Output: [4,5,2,7]
     * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
     */
    public static int[] sortArrayByParityII(int[] A) {
        int[] sort = new int[A.length];
        int even = 0;
        int odd = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sort[even] = A[i];
                even += 2;
            } else {
                sort[odd] = A[i];
                odd += 2;
            }
        }
        return sort;
    }

}
