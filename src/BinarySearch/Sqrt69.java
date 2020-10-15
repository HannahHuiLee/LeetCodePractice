package BinarySearch;

/**
 * created by Hannah Li on 2020-10-14
 * Project name: LeetcodeProject
 * LeetCode NO.: 69
 */
public class Sqrt69 {

    public static void main(String[] args) {

        Sqrt69 sqrt69 = new Sqrt69();
        System.out.println(sqrt69.mySqrt(8));

    }

    /**
     * Input: 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842..., and since
     *              the decimal part is truncated, 2 is returned.
     *              求开方
     */
    public int mySqrt(int x) {
        if (x <= 1) return x;

        int l = 1, r = x;
        while (l<= r){
            int mid = l +(r-l)/2;
            int sqrt = x / mid;
            if(sqrt == mid){
                return mid;
            }else if( mid > sqrt){
               r = mid -1;
            }else {
               l = mid +1;
            }
        }
        return r;
    }
}
