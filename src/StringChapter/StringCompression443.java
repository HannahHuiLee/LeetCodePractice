package StringChapter;

/**
 * created by Hannah Li on 19/1/29
 * Project name: LeetcodeProject
 * LeetCode NO.: 443
 */
public class StringCompression443 {

    public static void main(String[] args) {
        char [] c = {'a','a','b','b','c','c','c'};
        System.out.print(compress2(c));
    }
    /**
     * The length after compression must always be smaller than or equal to the original array.
     * 把一个有序数组压缩
     * Input:
     * ["a","a","b","b","c","c","c"]
     * Output:
     * Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
     */
    public static int compress2(char[] chars) {
        if (chars.length == 0) return 0;

        StringBuilder sb = new StringBuilder();
        char cur = chars[0];
        int sum = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == cur) {
                sum++;
            } else {
                sb.append(String.valueOf(cur));
                if (sum > 1) {
                    sb.append(sum);
                }
                if (i < chars.length) {
                    cur = chars[i];
                    sum = 1;
                }
            }
        }
        char[] compressChar = sb.toString().toCharArray();
        for (int i = 0; i < compressChar.length; i++) {
            chars[i] = compressChar[i];
        }
        return sb.length();
    }



}
