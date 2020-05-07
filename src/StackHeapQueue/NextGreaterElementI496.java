package StackHeapQueue;

import java.util.HashMap;
import java.util.Stack;

/**
 * created by Hannah Li on 2020-05-06
 * Project name: LeetcodeProject
 * LeetCode NO.: 496
 */
public class NextGreaterElementI496 {

    public static void main(String[] args) {
        NextGreaterElementI496 stack = new NextGreaterElementI496();
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        int[] res =  stack.nextGreaterElement(num1, num2);
        for(int num: res){
            System.out.println(num);
        }
    }


    /**
     * 两个for-loop
     * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
     * Output: [-1,3,-1]
     * Explanation:
     *     For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
     *     For number 1 in the first array, the next greater number for it in the second array is 3.
     *     For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
     */

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num : nums2){
            while (!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] res = new int[nums1.length];
        for(int i = 0; i < res.length; i++){
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }


}
