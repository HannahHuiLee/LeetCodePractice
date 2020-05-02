package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hannah Li on 2020-05-02
 * Project name: LeetcodeProject
 * LeetCode NO.: 401
 */
public class BinaryWatch401 {

    public static void main(String[] args) {
        BinaryWatch401 binaryWatch401 = new BinaryWatch401();
        List<String> strings = binaryWatch401.readBinaryWatch(0);
        System.out.println(strings.toString());
    }

    /**
     * 参见leetcode中的watch图片介绍
     * Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.
     * Input: n = 1
     * Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
     * <p>
     * time : 不知道
     * space : O(n)
     */
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        int[] nums1 = new int[]{1, 2, 4, 8};
        int[] nums2 = new int[]{32, 16, 8, 4, 2, 1};

        for (int i = 0; i <= num; i++) {
            List<Integer> list1 = generateDigit(nums1, i);
            List<Integer> list2 = generateDigit(nums2, num - i);
            for (int num1 : list1) {
                if (num1 >= 12) continue;
                for (int num2 : list2) {
                    if (num2 >= 60) continue;
                    res.add(num1 + ":" + (num2 < 10 ? "0" + num2 : num2));
                }
            }
        }
        return res;
    }

    private List<Integer> generateDigit(int[] nums, int count) {
        List<Integer> res = new ArrayList<>();
        helper(res, nums, count, 0, 0);
        return res;
    }

    private void helper(List<Integer> res, int[] nums, int count, int start, int sum) {
        if (count == 0) {
            res.add(sum);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            helper(res, nums, count - 1, i + 1, sum + nums[i]);
        }
    }
}
