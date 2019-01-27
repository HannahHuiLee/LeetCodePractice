package StringChapter;

import java.util.Stack;

/**
 * created by Hannah Li on 19/1/26
 * Project name: LeetcodeProject
 * LeetCode NO.: 20
 */
public class ValidParentheses20 {

    public static void main(String[] args) {
        String strs = "()[]{}";
        System.out.print(isValid(strs));
    }

    /**
     *Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * Input: "()[]{}"  --->   true
     *
     */
    public static boolean isValid(String s) {
        if(s == null || s.length() == 0) return true;

        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch=='('){
                stack.push(')');
            }else if(ch == '['){
                stack.push(']');
            }else if(ch == '{'){
                stack.push('}');
            }else{
                if(stack.isEmpty() || stack.pop() != ch){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}
