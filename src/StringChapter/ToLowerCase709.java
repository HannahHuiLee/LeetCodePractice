package StringChapter;

/**
 * created by Hannah Li on 19/2/6
 * Project name: LeetcodeProject
 * LeetCode NO.: 709
 */
public class ToLowerCase709 {


    public static void main(String[] args) {
        String s = "Hello";
        System.out.print(toLowerCase(s));
    }

    /**
     * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
     */
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
