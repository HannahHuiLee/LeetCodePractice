package arrayChapter;

import java.util.HashMap;

/**
 * created by Hannah Li on 2019-10-04
 * Project name: LeetcodeProject
 * LeetCode NO.: 3(middle difficult)
 */
public class LongestSubstring3M {


    public static void main(String[] args) {
        String str= "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }


    /**
     * Given a string, find the length of the longest substring without repeating characters.
     *
     * Input: "abcabcbb"
     * Output: 3
     */
    public static int lengthOfLongestSubstring(String s) {
        int start = 0; int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int end = 0; end < s.length(); end++){
           char rightChar = s.charAt(end);

           if(map.containsKey(rightChar)){
               start = Math.max(start, map.get(rightChar)+1);
           }

           map.put(rightChar, end);
           maxLength = Math.max(maxLength, end - start +1);

        }
        return maxLength;
    }


}
