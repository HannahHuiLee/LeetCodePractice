package ArrayChapter;

import java.util.PriorityQueue;

/**
 * created by Hannah Li on 2020-05-07
 * Project name: LeetcodeProject
 * LeetCode NO.: 215
 */
public class KthLargestElementInArray215 {

    public static void main(String[] args) {
        KthLargestElementInArray215 array215 = new KthLargestElementInArray215();
        int[] array = new int[]{3, 2, 1, 5, 6, 4};
        System.out.println(array215.findKthLargest2(array, 2));
    }

    /**
     * 非常重要
     * <p>
     * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
     * Input: [3,2,1,5,6,4] and k = 2
     * Output: 5
     * <p>
     * 方法： quick select
     */
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (true) {
            int pos = partition(nums, left, right);
            if (pos + 1 == k) {
                return nums[pos];
            } else if (pos + 1 > k) {
                right = pos - 1;
            } else {
                left = pos + 1;
            }
        }
    }

    /**
     * 3,2,1,5,6,4  k = 3
     * 0 1 2 3 4 5
     * pivot : 3  [3, 2, 1, 5, 6, 4]
     * [3, 4, 6, 5, 1, 2]   3
     * pivot : 5  [5, 4, 6, 3, 1, 2]
     * [5, 6, 4, 3, 1, 2]   1
     * pivot : 4  [6, 5, 4, 3, 1, 2]
     * [6, 5, 4, 3, 1, 2]   2
     */
    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int l = left + 1;
        int r = right;
        while (l <= r) {
            if (nums[l] < pivot && nums[r] > pivot) {
                swap(nums, l++, r--);
            }
            if (nums[l] >= pivot) l++;
            if (nums[r] <= pivot) r--;
        }
        swap(nums, left, r);
        return r;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    /**
     * 时间复杂度 O(NlogK)，空间复杂度 O(K)。
     * priority queue
     */
    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int n : nums) {
            priorityQueue.offer(n);
            if (priorityQueue.size() > k) { // 维护堆的大小为 K
                priorityQueue.poll(); // 检索并移除队列的头部
            }
        }
        return priorityQueue.peek();
    }


}
