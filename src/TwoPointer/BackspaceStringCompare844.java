package TwoPointer;

import java.util.Stack;

/**
 * created by Hannah Li on 19/1/6
 * Project name: LeetcodeProject
 * LeetCode NO.: 844
 */
public class BackspaceStringCompare844 {

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        BackspaceStringCompare844 bs = new BackspaceStringCompare844();

        System.out.print(bs.backspaceCompare(s,t));
    }

    /**
     * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
     * Input: S = "ab#c", T = "ad#c"  ---->   true
     * Explanation: Both S and T become "ac".
     */
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> SS = rewriteString(S);
        Stack<Character> TT = rewriteString(T);

        if (SS.size() != TT.size())
            return false;
        for (int i = 0; i < SS.size(); i++) {
            if (SS.pop() != TT.pop())
                return false;
        }
        return true;

    }

    public Stack<Character> rewriteString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '#')
                stack.push(c);
            else if (!stack.isEmpty())
                stack.pop();

        }
        return stack;
    }
}
