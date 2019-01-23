package MathCharpter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Hannah Li on 19/1/22
 * Project name: LeetcodeProject
 * LeetCode NO.: 728
 */
public class SelfDividingNumbers728 {

    public static void main(String[] args) {
        int m = 1, n = 22;
        System.out.print(selfDividingNumbers(m, n));
    }


    /**
     *A self-dividing number is a number that is divisible by every digit it contains.
     * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
     * Also, a self-dividing number is not allowed to contain the digit zero.
     *
     * Input:  left = 1, right = 22
     * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
     */
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                res.add(i);
            }
        }
        return res;
    }

    private static boolean isSelfDividing(int n) {
        int t = n;
        if (n == 0) return false;
        while (n > 0){
            if(n % 10 == 0) return false;
            if(t % (n % 10) != 0)return false;
            n /= 10;
        }
        return true;
    }
}
