package MathCharpter;

/**
 * created by Hannah Li on 19/1/23
 * Project name: LeetcodeProject
 * LeetCode NO.: 754
 */
public class ReachNumber754 {

    public static void main(String[] args) {
        int m = 3;
        System.out.print(reachNumber(m));
    }


    /**
     * You are standing at position 0 on an infinite number line. There is a goal at position target.
     * Return the minimum number of steps required to reach the destination.
     * Input: target = 3 -->  2
     * Explanation:
     * On the first move we step from 0 to 1.
     * On the second step we step from 1 to 3.
     * 首先我们要确定step，最后一个数用sum来表示，如果target > sum说明还没加够，必须让sum >= target，
     * 但发现每两行是同奇或同偶，所以如果sum - target为偶数，说明在此行，直接输出，如果为奇数，那么step必须还得往后数，
     * 此时，step为偶数时 + 1， step为奇数时 + 2.
     */
    public static int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0;
        int n = 0;
        while (sum < target){
            n++;
            sum += n;
        }
        if(sum == target) return n;
        int res = sum - target;
        if((res & 1) == 0){
            return n;
        }else{
            return n +((n & 1) == 0? 1:2);
        }

    }

}
