package StackHeapQueue;

import java.util.Stack;

/**
 * created by Hannah Li on 2020-05-07
 * Project name: LeetcodeProject
 * LeetCode NO.: 682
 */
public class BaseballGame682 {

    public static void main(String[] args) {
        BaseballGame682 basket = new BaseballGame682();
        String[] games = {"5", "2", "C", "D", "+"};
        System.out.println(basket.calPoints(games));
    }


    /**
     * c: cancel
     * d: double
     * +: sum
     * <p>
     * Input: ["5","2","C","D","+"]
     * Output: 30
     * Explanation:
     * Round 1: You could get 5 points. The sum is: 5.
     * Round 2: You could get 2 points. The sum is: 7.
     * Operation 1: The round 2's data was invalid. The sum is: 5.
     * Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
     * Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
     */
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("D")) {
                int x = stack.peek();
                sum += x * 2;
                stack.push(2 * x);
            } else if (ops[i].equals("C")) {
                int x = stack.pop();
                sum -= x;
            } else if (ops[i].equals("+")) {
                int x = stack.peek() + stack.get(stack.size() - 2);
                sum += x;
                stack.push(x);
            } else {
                int x = Integer.parseInt(ops[i]);
                sum += x;
                stack.push(x);
            }
        }
        return sum;
    }

}
