package HashTableChapter;

import java.util.HashSet;
import java.util.Set;

/**
 * created by Hannah Li on 18/12/9
 * Project name: LeetcodeProject
 * LeetCode NO.: 575
 */
public class DistributeCandy575 {

    public static void main(String[] args) {
        int[] boom = {1,1,2,3};
        System.out.print(distributeCandies(boom));
    }

    /**
     * Given an integer array with even length, where different numbers in this array represent different kinds of candies.
     * Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister.
     * Return the maximum number of kinds of candies the sister could gain.
     * <p>
     * Input: candies = [1,1,2,2,3,3]
     * Output: 3
     * Explanation:
     * There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
     * Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
     * The sister has three different kinds of candies.
     *
     * 104s
     */
    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        int num = 0, type = 0, len = candies.length;
        for (int i = 0; i < len; i++) {
            if (num >= len / 2) break;

            if (!set.contains(candies[i])) {
                set.add(candies[i]);
                num++;
                type++;
            }
        }
        return type;
    }

}
