package ArrayChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 18/11/9
 */
public class PlusOne {

    public static void main(String[] args) {

//        int[] digits = {1,3,4,5};
//        int[] digits = {1,0,9,9};
        int[] digits = {9,9,9,9};

        int[] res = plusOne(digits);
        System.out.print(Arrays.toString(res));

    }


    /**
     * case1 : 1001   1002
     * case2 : 1099   1100
     * case3 : 9999   10000
     */
    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return digits;

        // 从个位数开始，往前走
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            }
        }

        // 这种情况考虑全部为9 进1位的情况。
        int[] result = new int[digits.length + 1];
        result[0]= 1;
        return result;


    }

}
