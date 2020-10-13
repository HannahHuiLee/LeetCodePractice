package ArrayChapter;

/**
 * created by Hannah Li on 18/11/8
 * maximum subarray: 在一个数组中，找到连续的子数组，和为最大值.
 */
public class MaximumSubarray {
    // num[i] = num[i-1]>0? num[i]+num[i-1] : num[i]
    //            -2, 1, -2, 4,  3, 5, 6,  1, 5
   static int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    public static void main() {

       System.out.print(maxSubArray(nums));
    }


    // maximum sub array
    public static int maxSubArray(int[] nums) {
        int[] copy = new int[nums.length];

        copy[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {

            copy[i] = nums[i] + (copy[i - 1] > 0 ? copy[i - 1] : 0); // 1, -2, 4

            res = Math.max(res, copy[i]); // 1, 1, 4,
        }

        return res;
    }


}
