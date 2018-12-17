package HashTableChapter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * created by Hannah Li on 18/12/16
 * Project name: LeetcodeProject
 * LeetCode NO.: 720
 */
public class LongestWordDictionary720 {

    public static void main(String[] args) {
        String[] nums = {"w","wo","wor","worl", "world"};
        System.out.print(longestWord(nums));
    }

    /**
     * Given a list of strings words representing an English Dictionary,
     * find the longest word in words that can be built one character at a time by other words in words.
     * If there is more than one possible answer, return the longest word with the smallest lexicographical order.
     * Input:
     * words = ["w","wo","wor","worl", "world"]
     * Output: "world"
     * Explanation:
     * The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
     * 19ms--59.7
     */
    public static String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> builds = new HashSet<>();
        String res = "";
        for(String word : words){
            if(word.length() == 1 || builds.contains(word.substring(0, word.length() - 1))){
                res = word.length() > res.length()? word : res;
                builds.add(word);
            }
        }
        return res;
    }

}
