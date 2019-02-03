package StringChapter;

/**
 * created by Hannah Li on 19/2/2
 * Project name: LeetcodeProject
 * LeetCode NO.: 541
 */
public class ReverseStringII541 {

    public static void main(String[] args) {
        String s = "a";
        int k = 2;
        System.out.print(reverseStr(s,k));
    }
    /**
     * Given a string and an integer k, you need to reverse the first k characters
     * for every 2k characters counting from the start of the string.
     * Input: s = "abcdefg", k = 2 ---->   "bacdfeg"
     */
    public static String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int start = 0;
        int end = k;
        while (end <= s.length()) {
            res.append(new StringBuilder(s.substring(start, end)).reverse().toString());
            if (end + k < s.length()) {
                res.append(new StringBuilder(s.substring(start + k, end + k)).toString());
            } else {
                res.append(new StringBuilder(s.substring(start + k)).toString());
            }
            start += 2*k;
            end += 2 * k;
        }
       if(end > s.length() && start < s.length()){
           res.append(new StringBuilder(s.substring(start)).reverse().toString());
       }
       return res.toString();
    }

}
