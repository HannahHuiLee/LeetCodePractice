package arrayChapter;

/**
 * Created by huilee on 2018/3/28.
 */
public class ArrayTwoSum {


    public static void main(String[] args) {
        int nums[] = {19, 7, 9, 24, 12, 5};
        int target = 12;
        int[] ints = twoSum(nums, target);
        System.out.println("index0 is " + ints[0] + " index1 is " + ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        indexs[0] = i;
                        indexs[1] = j;
                    }
                }
            }
        }
        return indexs;
    }


}
