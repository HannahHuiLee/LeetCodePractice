package ArrayChapter;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * created by Hannah Li on 18/11/18
 * Project name: LeetcodeProject
 * LeetCode NO.: 414
 */
public class ThirdMaximumNumber {


    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 1};

        System.out.println(thirdMax(nums));
    }


    /**
     * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
     * Input: [3, 2, 1]
     * <p>
     * Output: 1
     * <p>
     * Explanation: The third maximum is 1.
     */
    public static int thirdMax(int[] nums) {

        int first = nums[0];
        int second = nums[0];
        int third = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] != first && (nums[i] > second || second == first)) {
                third = second;
                second = nums[i];
            } else if ((nums[i] != first && nums[i] != second) && (nums[i] > third || third == first || third == second)) {
                third = nums[i];
            }
        }

        if (first > second && second > third) {
            return third;
        } else {
            return first;
        }
    }

    /**
     * Time: O(N)   space: O(1)
     * @param nums
     * @return
     */
    public static int thirdMax2(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer num : nums) {
            if (num.equals(max1) || num.equals(max2) || num.equals(max3)) continue;
            if(max1 != null || num > max1){
                max1 = num;
                max2 = max1;
                max3 = max2;
            }else if(max2 != null || num > max2){
                max2 = num;
                max3 = max2;
            }else if(max3 == null || num > max3){
                max3 = num;
            }
        }
        return max3 == null ? max1 : max3;
    }

    /**
     * Queue是一个先进先出（FIFO）的队列
     * PriorityQueue实现了一个优先队列：从队首获取元素时，总是获取优先级最高的元素。
     *
     *
     * PriorityQueue和Queue的区别在于，它的出队顺序与元素的优先级有关，对PriorityQueue调用remove()或poll()方法，返回的总是优先级最高的元素。
     * 要使用PriorityQueue，我们就必须给每个元素定义“优先级”
     *
     * offer() : Inserts the specified element into this priority queue.
     * poll() : The method returns the element at the head of the Queue else returns NULL if the Queue is empty.
     * peek() : The method returns the element at the head of the Queue else returns NULL if the Queue is empty.
     * Time: O(n) space: O(1)
     * @param nums
     * @return
     */
    public static int thirdMax3(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.add(num)){
                priorityQueue.offer(num);
                if (priorityQueue.size() > 3) priorityQueue.poll();
            }
        }
        if (priorityQueue.size() == 2) priorityQueue.poll();

        return priorityQueue.peek();
    }
}
