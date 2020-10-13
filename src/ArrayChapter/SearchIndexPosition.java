package ArrayChapter;

/**
 * created by Hannah Li on 18/11/7
 * search index
 */
public class SearchIndexPosition {

    static int[] nums = {1,2,5,8};
    static int target = 3;

    public static void main(String[] args) {
        int index = searchInsert(nums, target);
        System.out.print(index);
    }


    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

}
