package StackHeapQueue;

import java.util.Optional;
import java.util.PriorityQueue;

/**
 * created by Hannah Li on 2020-05-08
 * Project name: LeetcodeProject
 * LeetCode NO.: 703
 */
public class KthLargestElementInStream703 {

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {4,5,8,2};
        KthLargestElementInStream703 kthLargest = new KthLargestElementInStream703(k, arr);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }


    /**
     * 返回第K大的值。 堆排序。 堆内最小，整体第K大
     * Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream.
     * For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.
     * int k = 3;
     * int[] arr = [4,5,8,2];
     * KthLargest kthLargest = new KthLargest(3, arr);
     * kthLargest.add(3);   // returns 4
     * kthLargest.add(5);   // returns 5
     * kthLargest.add(10);  // returns 5
     * kthLargest.add(9);   // returns 8
     * kthLargest.add(4);   // returns 8
     *
     * pop：相当于get的操作，就是只zd是查看。从此列表所表示的堆栈处弹回出一个元素
     * poll：相当于先get然后再remove掉，就是查看的同时，也将这个元素从答容器中删除掉。 获取并移除此列表的头（第一个元素）
     */

    private PriorityQueue<Integer> queue;
    private int k;

    public KthLargestElementInStream703(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();
        for(int num : nums){
            add(num);
            maintainKLength();
        }
    }

    private void maintainKLength() {
        if(queue.size() > k){
            queue.poll();
        }
    }

    public int add(int val) {
        queue.add(val);
        maintainKLength();
        return Optional.ofNullable(queue.peek()).orElse(-1);
    }

}
