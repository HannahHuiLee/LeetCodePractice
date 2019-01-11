package MathCharpter;

/**
 * created by Hannah Li on 19/1/10
 * Project name: LeetcodeProject
 * LeetCode NO.: 168
 */
public class ExcelSheetColumnTitle168 {

    public static void main(String[] args){
        int num = 1;
        System.out.print(convertToTitle(num));
    }


    /**
     * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
     * Input: 28--->"AB"
     *
     *     1 -> A
     *     2 -> B
     *     3 -> C
     *     ...
     *     26 -> Z
     *     27 -> AA
     *     28 -> AB
     *     ...
     */
    public static String convertToTitle(int n) {

        StringBuilder sb = new StringBuilder();
        while (n > 0){
            n--;
            sb.append((char)('A' + n % 26));
            n /= 26;
        }
        return sb.reverse().toString();
    }

}
