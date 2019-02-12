package StringChapter;

import java.util.HashMap;

/**
 * created by Hannah Li on 19/2/11
 * Project name: LeetcodeProject
 * LeetCode NO.: 819
 */
public class MostCommonWord819 {


    public static void main(String[] args) {
        String s = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String [] banner  = {"hit"};
        System.out.print(mostCommonWord(s, banner));
    }

    /**
     *Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
     * Input:
     * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
     * banned = ["hit"]
     * Output: "ball"
     */
    public static String mostCommonWord(String paragraph, String[] banned) {
        String [] words = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) +1);
        }
        for(String word : banned){
            if(map.containsKey(word)){
                map.remove(word);
            }
        }
        String res = null;
        for(String word : map.keySet()){
            if(res == null || map.get(word) > map.get(res)){
                res = word;
            }
        }
        return res;
    }

}
