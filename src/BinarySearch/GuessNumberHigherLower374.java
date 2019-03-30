package BinarySearch;

/**
 * created by Hannah Li on 19/3/29
 * Project name: LeetcodeProject
 * LeetCode NO.: 374
 */
public class GuessNumberHigherLower374 {

    /**
     * I pick a number from 1 to n. You have to guess which number I picked.
     * Every time you guess wrong, I'll tell you whether the number is higher or lower.
     * 典型的猜价格的问题，根据对方说高了还是低了来缩小范围，最简单快速的方法就是折半搜索法
     */
    public int guessNumber(int n) {
        int min =1, max = n;
        while (true){
            int mid = (min + (max - min) / 2);
            switch (guess(mid)){
                case 1:
                    min = mid+1;
                    break;
                case -1:
                    max = mid;
                    break;
                case 0:
                    return mid;
            }
        }
    }

    // 防止编译器报错函数
    public int guess(int num) {
        return 0;
    }
}
