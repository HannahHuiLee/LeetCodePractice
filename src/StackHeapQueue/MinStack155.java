package StackHeapQueue;

import java.util.Stack;

/**
 * created by Hannah Li on 2020-05-03
 * Project name: LeetcodeProject
 * LeetCode NO.: 155
 */
public class MinStack155 {

    public static void main(String[] args) {
        MinStack155 minStack = new MinStack155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    /**
     * Explanation
     *      MinStack minStack = new MinStack();
     *      minStack.push(-2);
     *      minStack.push(0);
     *      minStack.push(-3);
     *      minStack.getMin(); // return -3
     *      minStack.pop();
     *      minStack.top();    // return 0
     *      minStack.getMin(); // return -2
     *
     * Input
     * ["MinStack","push","push","push","getMin","pop","top","getMin"]
     * [[],[-2],[0],[-3],[],[],[],[]]
     *
     * Output
     * [null,null,null,null,-3,null,0,-2]
     */

    Stack<Integer> stack;
    int min;

    /** initialize your data structure here. */
    public MinStack155() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if(x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min){
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }


}
