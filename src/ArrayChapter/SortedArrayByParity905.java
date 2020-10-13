package ArrayChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/11/29
 * Project name: LeetcodeProject
 * LeetCode NO.: 905
 */
public class SortedArrayByParity905 {

    public static void main(String[] args) {
        int[] numbs1 = {1, 5, 2};
        System.out.print(Arrays.toString(sortArrayByParity(numbs1)));
    }


    /**
     * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
     * You may return any answer array that satisfies this condition.
     * <p>
     * Input: [3,1,2,4]
     * Output: [2,4,3,1]
     * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     */
    public static int[] sortArrayByParity(int[] A) {
        if(A == null || A.length <= 0) return null;
        int[] result = new int[A.length];
        int startPointer = 0;
        int endPointer = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[startPointer] = A[i];
                startPointer++;
            } else {
                result[endPointer] = A[i];
                endPointer--;
            }
        }
        return result;
    }


}
