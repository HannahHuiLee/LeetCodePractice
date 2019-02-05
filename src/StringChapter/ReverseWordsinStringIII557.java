package StringChapter;


/**
 * created by Hannah Li on 19/2/4
 * Project name: LeetcodeProject
 * LeetCode NO.: 557
 */
public class ReverseWordsinStringIII557 {


    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.print(reverseWords(s));
    }

    /**
     * Given a string, you need to reverse the order of characters
     * in each word within a sentence while still preserving whitespace and initial word order.
     * Input: "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     */
    public static String reverseWords(String s) {
        String[] strs = s.split(" ");
        String result = "";
        int len = strs.length;
        for (int i = 0; i < len - 1; i++) {
            result += reverse(strs[i])+" ";
        }
        result += reverse(strs[len-1]);
        return result;
    }

    public static String reverse(String str) {
        String result = "";
        int len = str.length();
        for(int i = 0; i< len; i++){
            result = str.charAt(i) + result;
        }
        return result;
    }

}
