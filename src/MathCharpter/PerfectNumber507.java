package MathCharpter;

/**
 * created by Hannah Li on 19/1/19
 * Project name: LeetcodeProject
 * LeetCode NO.: 507
 */
public class PerfectNumber507 {

    public static void main(String[] args) {
        int num = 28;
        System.out.print(checkPerfectNumber(num));
    }


    /**
     * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
     * 大意：判断一个数的因数和是不是等于它本身。
     * Input: 28--> True
     * Explanation: 28 = 1 + 2 + 4 + 7 + 14
     * 本题思路比较简单，构造从2开始的循环，循环次数小于等于sqrt(num)，期间求num得约数
     */
    public static boolean checkPerfectNumber(int num) {
        if(num == 1) return false;
        int sum = 1;
        for(int i = 2;i * i <= num; i++){
            if(num % i == 0) sum += (i + num/i);
            if(i * i == num) sum -=i;
            if(sum > num) return false;
        }
        return sum == num;
    }



}
