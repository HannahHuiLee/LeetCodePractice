package StringChapter;

/**
 * created by Hannah Li on 19/1/26
 * Project name: LeetcodeProject
 * LeetCode NO.: 58
 */
public class LengthLastWord58 {

    public static void main(String[] args) {
        String strs = "Hello World";
        System.out.print(lengthOfLastWord(strs));
    }

    /**
     *Input: "Hello World"  --->   5
     */
    public static int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") -1;
    }

}
