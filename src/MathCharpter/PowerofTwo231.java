package MathCharpter;

/**
 * created by Hannah Li on 19/1/13
 * Project name: LeetcodeProject
 * LeetCode NO.: 231
 */
public class PowerofTwo231 {


    public static void main(String[] args) {
        int s = 16;
        System.out.print(isPowerOfTwo(s));
    }

    /**
     * Given an integer, write a function to determine if it is a power of two.
     * Input: 16--->true
     * Explanation: 24 = 16
     * <p>
     * 转换成二进制，如果是2的次方数，那一定是最高位为1，其余位均为0的二进制数，所以只用判断这个二进制数是不是符合这个情况就可以了
     */
    public static boolean isPowerOfTwo(int n) {
        if (n < 0) return false;
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length(); i++) {
            if (i == 0 && binaryString.charAt(i) != '1') {
                return false;
            }else if(i >0 && binaryString.charAt(i) != '0'){
                return false;
            }
        }
        return true;
    }

}
