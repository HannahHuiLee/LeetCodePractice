package arrayChapter;

/**
 * created by Hannah Li on 18/11/29
 * Project name: LeetcodeProject
 * LeetCode NO.: 896
 */
public class MonotonicArray896 {


    public static void main(String[] args) {
        int[] numbs1 = {1, 5, 2};
        System.out.print(isMonotonic(numbs1));
    }

    /**
     * An array is monotonic if it is either monotone increasing or monotone decreasing.
     * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
     * Return true if and only if the given array A is monotonic.
     * <p>
     * 判断数组是否为单调递增或递减
     * Input: [1,3,2]
     * Output: falseØ
     */
    public static boolean isMonotonic(int[] A) {
        if (A == null || A.length <= 0) return false;

        boolean asc = true;
        boolean desc = true;
        int preview = A[0];

        for (int i = 1; i < A.length && (asc || desc); i++) {
            if (A[i] > preview) {
                desc = false;
            }
            if (A[i] < preview) {
                asc = false;
            }
            preview = A[i];
        }
        return asc || desc;
    }
}
