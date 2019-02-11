package StringChapter;

/**
 * created by Hannah Li on 19/2/10
 * Project name: LeetcodeProject
 * LeetCode NO.: 788
 */
public class RotatedDigits788 {

    public static void main(String[] args) {
        int s = 10;
        System.out.print(rotatedDigits(s));
    }

    /**
     * X is a good number if after rotating each digit individually by 180 degrees,
     * we get a valid number that is different from X.
     * Each digit must be rotated - we cannot choose to leave it alone.
     * 给一个字符串，独立旋转每个数字180°，判断得到的新字符串是否合法。
     * 1.出现数字3,4,7一定不合法
     * 2.新字符串 == 原来字符串不合法
     * Input: 10 -->  4
     */
    public static int rotatedDigits(int N) {
        int[] dp = new int[N + 1];
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (i < 10) {
                if (i == 0 || i == 1 || i == 8) {
                    dp[i] = 1;
                } else if (i == 2 || i == 5 || i == 6 || i == 9) {
                    dp[i] = 2;
                    count++;
                }
            } else {
                int a = dp[i / 10], b = dp[i % 10];
                if (a == 1 && b == 1) {
                    dp[i] = 1;
                }else if(a >= 1 && b >= 1){
                    dp[i] = 2;
                    count++;
                }
            }
        }
        return count;
    }

}
