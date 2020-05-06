package StackHeapQueue;

import java.util.Stack;

/**
 * created by Hannah Li on 2020-05-05
 * Project name: LeetcodeProject
 * LeetCode NO.: 232
 */
public class ImplementQueueUsingStacks232 {

    public static void main(String[] args) {
        ImplementQueueUsingStacks232 queue = new ImplementQueueUsingStacks232();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.empty());
    }

    /**
     * queue: 321
     * stack: 123
     * <p>
     * MyQueue queue = new MyQueue();
     * queue.push(1);
     * queue.push(2);
     * queue.peek();  // returns 1
     * queue.pop();   // returns 1
     * queue.empty(); // returns false
     */

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if(!stack2.isEmpty()){
            return stack2.peek();
        } else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.peek();
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}
