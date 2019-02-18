package StringChapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * created by Hannah Li on 19/2/17
 * Project name: LeetcodeProject
 * LeetCode NO.: 937
 */
public class ReorderLogFiles937 {

    public static void main(String[] args) {
        String[] s = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        System.out.print(reorderLogFiles(s));
    }

    /**
     * You have an array of logs.  Each log is a space delimited string of words.
     * 将日志重新排序，使得所有字母日志都排在数字日志之前。字母日志按字母顺序排序，忽略标识符，
     * 标识符仅用于表示关系。数字日志应该按原来的顺序排列。
     * 返回日志的最终顺序。
     * Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
     * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
     */
    public static String[] reorderLogFiles(String[] logs) {
        List<String> numList = new ArrayList<>();
        TreeMap<String, String> charMap = new TreeMap<>();
        for (String log : logs) {
            char last = log.charAt(log.length() - 1);
            if (last <= '9' && last >= '0') {
                numList.add(log);
            } else {
                int firstSpace = log.indexOf(" ");
                String head = log.substring(0, firstSpace);
                String tail = log.substring(firstSpace);
                charMap.put(tail, head);
            }
        }
        List<String> result = new ArrayList<>(logs.length);
        for (Map.Entry entry : charMap.entrySet()) {
            result.add((String) entry.getValue() + (String)entry.getKey());
        }
        result.addAll(numList);
        return result.toArray(new String[0]);
    }
}
