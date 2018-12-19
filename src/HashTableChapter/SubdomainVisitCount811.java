package HashTableChapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by Hannah Li on 18/12/18
 * Project name: LeetcodeProject
 * LeetCode NO.: 811
 */
public class SubdomainVisitCount811 {


    public static void main(String[] args) {
        String[] jewel = {"9001 discuss.leetcode.com"};
        System.out.print(subdomainVisits(jewel));
    }


    /**
     * Example 1:
     * Input:
     * ["9001 discuss.leetcode.com"]
     * Output:
     * ["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
     * Explanation:
     * We only have one website domain: "discuss.leetcode.com". As discussed above,
     * the subdomain "leetcode.com" and "com" will also be visited.
     * So they will all be visited 9001 times.
     *
     * 题目：前面的数字可以看做出现的个数。问题要求统计各个域名出现的次数。
     * 14--97%
     */
    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains) {
            int space = s.indexOf(' ');
            int num = Integer.parseInt(s.substring(0, space));
            s = s.substring(space + 1, s.length());
            while (true) {
                int index = s.indexOf('.');
                map.put(s, map.getOrDefault(s, 0) + num);
                if (index == -1) break;
                s = s.substring(index + 1, s.length());
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            result.add(e.getValue() + " " + e.getKey());
        }
        return result;
    }

}
