package Greedy;

/**
 * created by Hannah Li on 2020-10-14
 * Project name: LeetcodeProject
 * LeetCode NO.: 392
 */
public class IsSubsequence392 {

    public static void main(String[] args) {
        IsSubsequence392 isSubsequence392 = new IsSubsequence392();
        System.out.println(isSubsequence392.isSubsequence("abc", "ahbgdc"));
    }

    /**
     * Input: s = "abc", t = "ahbgdc"
     * Output: true
     * 判断是否为子序列
     */
    public boolean isSubsequence(String s, String t) {
        int i = -1;
        for (char c : s.toCharArray()){
            i = t.indexOf(c, i +1);
            if(i == -1) return false;
        }
        return true;
    }

}
