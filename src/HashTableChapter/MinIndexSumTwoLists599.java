package HashTableChapter;

import java.util.*;

/**
 * created by Hannah Li on 18/12/11
 * Project name: LeetcodeProject
 * LeetCode NO.: 599
 */
public class MinIndexSumTwoLists599 {

    public static void main(String[] args) {
        String[] s1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] s2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.print(Arrays.toString(findRestaurant(s1, s2)));
    }

    /**
     * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.
     * You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers,
     * output all of them with no order requirement. You could assume there always exists an answer.
     * Input:
     * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
     * ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
     * Output: ["Shogun"]
     * Explanation: The only restaurant they both like is "Shogun".
     */
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new LinkedList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);
        for (int i = 0; i < list2.length; i++) {
            Integer j = map.get(list2[i]);
            if (j != null && i + j <= minSum) {
                if (i + j < minSum) {
                    res.clear();
                    minSum = i+j;
                }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }



}
