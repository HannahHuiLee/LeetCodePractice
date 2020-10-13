package arrayChapter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * created by Hannah Li on 18/11/28
 * Project name: LeetcodeProject
 * LeetCode NO.:888
 */
public class FairCandySwap888 {

    public static void main(String[] args) {
        int[] numbs1 = {1,5,2};
        int[] numbs2 = {4,2};
        System.out.print(Arrays.toString(fairCandySwap(numbs2, numbs1)));
    }


    /**
     * Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.
     *
     * Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
     *
     * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.
     *
     * If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
     *
     * Input: A = [1,2,5], B = [2,4]
     * Output: [5,4]
     * 交换数组中的一个值，使的两个数组中的和相等
     */
    public static int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int delta = (sumA - sumB)/ 2;

        Set<Integer> set = new HashSet<>();
        for(int candy : B){
            set.add(candy);
        }

        for(int candy : A){
            if(set.contains(candy- delta)){
                return new int[]{candy, candy - delta};
            }
        }
        return null;
    }

}
