package BinarySearch;

/**
 * created by Hannah Li on 2020-10-14
 * Project name: LeetcodeProject
 * LeetCode NO.: 540
 */
public class SingleElementSortedArray540 {

    public static void main(String[] args) {
        SingleElementSortedArray540 sortedArray540 = new SingleElementSortedArray540();
        int [] nums = new int[]{1,1,2,3,3,4,4,8,8};
        System.out.println(sortedArray540.singleNonDuplicate(nums));
    }

    /**
     * Input: nums = [1,1,2,3,3,4,4,8,8]
     * Output: 2
     * 一个有序数组只有一个数不出现两次，找出这个数。
     */
    public int singleNonDuplicate(int[] nums) {
        int l= 0, h = nums.length - 1;
        while (l < h){
            int mid = l + (h - l)/2;
            if(mid % 2 == 1) mid--;  // 保证 l/h/m 都在偶数位，使得查找区间大小一直都是奇数
            if(nums[mid]==nums[mid+1]){
                l = mid +2;
            }else{
                h = mid;
            }
        }
        return nums[l];
    }
}
