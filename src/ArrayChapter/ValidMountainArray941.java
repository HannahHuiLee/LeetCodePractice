package ArrayChapter;

/**
 * created by Hannah Li on 18/11/29
 * Project name: LeetcodeProject
 * LeetCode NO.: 941
 */
public class ValidMountainArray941 {

    public static void main(String[] args) {
        int[] numbs1 = {0,3,2,1};
        System.out.print(validMountainArray(numbs1));
    }


    /**
     * Given an array A of integers, return true if and only if it is a valid mountain array.
     * Recall that A is a mountain array if and only if:
     * Input: [3,5,5]
     * Output: false
     * 题目介绍：判断一个数组是不是山形数组，山形数组最少有3个数字，中间有个最大的数字，往两边都是依次减小的
     * 思路：设置左右端点双指针，以左端点为例，若右侧数字大于左侧，则左指针右移。右指针执行类似操作。最后判断是否双指针汇合。(不是本答案)
     */
    public static boolean validMountainArray(int[] A) {
        if (A == null || A.length <= 0) return false;

        boolean isAscending = true;
        int max = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) return false;
            if (A[max] < A[i] && isAscending) {
                max = i;
                continue;
            } else {
                isAscending = false;
            }
            if (!isAscending && A[i] > A[i - 1]) {
                return false;
            }
        }
        return !isAscending && (max != 0 && max != A.length - 1);
    }
}
