package StackHeapQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by Hannah Li on 2020-05-04
 * Project name: LeetcodeProject
 * LeetCode NO.: 225
 */
public class ImplementStackUsingQueues225 {

    public static void main(String[] args) {
        ImplementStackUsingQueues225 stack = new ImplementStackUsingQueues225();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }


    /**
     * stack: 先进后出  1234   闭口的   桶
     * queue: 先进先出  4321   开口的
     *
     * MyStack stack = new MyStack();
     * stack.push(1);
     * stack.push(2);
     * stack.top();   // returns 2
     * stack.pop();   // returns 2
     * stack.empty(); // returns false
     */

    Queue<Integer> queue;

    /** Initialize your data structure here. */
    public ImplementStackUsingQueues225() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for(int i = 0; i < queue.size() - 1; i++){
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

}
