package HashTableChapter;

/**
 * created by Hannah Li on 18/11/30
 * Project name: LeetcodeProject
 * LeetCode NO.: 136
 */
public class SingleNumber136 {

    public static void main(String[] args) {
        int[] numbs1 = {4,1,2,1,2};
        System.out.print(singleNumber(numbs1));
    }

    /**
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     * Note:
     * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     *
     * Input: [4,1,2,1,2]
     * Output: 4
     *  考察 位运算
     *  异或：^ 相同为0， 不同为1.
     *       两个相同的数异或后为0；
     *       0和一个数异或后为那个数；
     *       异或运算满足交换律
     *
     *  思路： 那么我们用0去依次和数组中的数进行异或，结果再继续和下一个数异或，一遍下来，每个数字都异或到了，交换律一遍，
     *        就是让每两个相同的数字都自己跟自己异或，结果都是0，然后0和那个单独的数字异或，结果就是那个单独的数字
     */
    public static int singleNumber(int[] nums) {

        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}
