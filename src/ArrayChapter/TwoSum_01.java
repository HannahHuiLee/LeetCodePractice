package arrayChapter;

/**
 * Created by huilee on 2018/3/28.
 */
public class TwoSum_01 {


    public static void main(String[] args) {
        int nums[] = {-1,-2,-3,-4,-5};
        int target = -8;

        int[] ints = twoSum(nums, target);
        System.out.println("index0 is " + ints[0] + " index1 is " + ints[1]);
    }
    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * 1. 暴力解法：
     * 2. set： x+y=9=> y = 9-x       O（N）
     *        for x: 0->length
     *        set:  9-x
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexs[0] = i;
                    indexs[1] = j;
                }
            }
        }
        return indexs;
    }


}
