package MathCharpter;

/**
 * created by Hannah Li on 19/1/13
 * Project name: LeetcodeProject
 * LeetCode NO.: 258
 */
public class AddDigits258 {

    public static void main(String[] args) {
        int s = 19;
        System.out.print(addDigits(s));
    }

    /**
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38
     * Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
     *              Since 2 has only one digit, return it.
     *
     */
    public static int addDigits(int num) {
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        if(sum >= 10){
            return addDigits(sum);
        }else{
            return sum;
        }
    }

    public static int addDigits2(int num) {
        return num % 9 == 0 ? (num == 0 ? 0 : 9) : num % 9;
    }


}
