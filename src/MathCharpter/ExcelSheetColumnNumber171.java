package MathCharpter;

/**
 * created by Hannah Li on 19/1/11
 * Project name: LeetcodeProject
 * LeetCode NO.: 171
 */
public class ExcelSheetColumnNumber171 {

    public static void main(String[] args) {
        String s = "AB";
        System.out.print(titleToNumber(s));
    }

    /**
     * Given a column title as appear in an Excel sheet, return its corresponding column number.
     * Input: "AB"  ---->   28
     * <p>
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * ...
     */
    public static int titleToNumber(String s) {

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res * 26 + (s.charAt(i) - 'A' + 1);
        }
        return res;

    }

}
