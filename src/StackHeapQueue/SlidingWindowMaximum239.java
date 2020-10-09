package StackHeapQueue;

import java.util.*;

/**
 * created by Hannah Li on 2020-10-08
 * Project name: LeetcodeProject
 * LeetCode NO.: 239
 */
public class SlidingWindowMaximum239 {

    /**
     * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
     * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
     * <p>
     * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
     * Output: [3,3,5,5,6,7]
     * <p>
     * Input: nums = [9,11], k = 2
     * Output: [11]
     * <p>
     * 1. MaxHeap: N logK
     * 2. queue: deque: 1. 入队列 2. 维护     Time: O(N * 1)
     * 解法1: 优先队列Priority Queue，维护一个大小为K的最大堆，每向右移动1位，都把堆中上一个窗口中最左边的数扔掉，
     * 再把新数加入堆中，这样堆顶就是这个窗口内最大的值。
     * T： O(nlogk) ，S：O(k)
     *
     * deque deque deque deque deque deque deque
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }

    public static int[] maxSlidingWindow2(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int[] res = new int[nums.length + 1 - k];
        for (int i = 0; i < nums.length; i++) {
            // 去掉窗口最左边的数字
            if (i >= k) priorityQueue.remove(nums[i - k]);
            // 把新的数加入窗口的堆中
            priorityQueue.offer(nums[i]);
            // 堆顶就是窗口的最大值
            if (i + 1 >= k) res[i + 1 - k] = priorityQueue.peek();
        }
        return res;
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length+1-k];
        for (int i =0;i<nums.length;i++){
            if (!deque.isEmpty() && deque.peekFirst() == i-k){
                deque.poll();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }
            deque.offerLast(i);
            if((i+1)>=k){
                res[i+1-k] = nums[deque.peek()];
            }
        }
        return res;
    }

}


