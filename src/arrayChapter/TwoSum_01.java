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
