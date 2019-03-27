package BinarySearch;

/**
 * created by Hannah Li on 19/3/26
 * Project name: LeetcodeProject
 * LeetCode NO.: 278
 */
public class FirstBadVersion278 {


    /**
     * Given n = 5, and version = 4 is the first bad version.
     * <p>
     * call isBadVersion(3) -> false
     * call isBadVersion(5) -> true
     * call isBadVersion(4) -> true
     * <p>
     * Then 4 is the first bad version.
     */
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
//            if (isBadVersion(mid)) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
        }
        return left;
    }

}
