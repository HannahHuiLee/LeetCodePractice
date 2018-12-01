package HashTableChapter;

import java.util.HashMap;

/**
 * created by Hannah Li on 18/12/1
 * Project name: LeetcodeProject
 * LeetCode NO.: 290
 */
public class WordPatten290 {

    public static void main(String[] args) {
        String s = "abba", t = "dog cat cat dog";
        System.out.print(wordPattern(s,t));
    }

    /**
     * Given a pattern and a string str, find if str follows the same pattern.
     * Input: pattern = "abba", str = "dog cat cat dog"
     * Output: true
     * <p>
     * Input:pattern = "abba", str = "dog cat cat fish"
     * Output: false
     */
    public static boolean wordPattern(String pattern, String str) {
        if (pattern == null || pattern.length() == 0 || str == null) return false;

        char[] patArr = pattern.toCharArray();
        String[] word = str.split(" ");

        if (patArr.length != word.length) return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < word.length; i++) {

            if(!map.containsKey(patArr[i])){
                if(i>0 && map.get(patArr[i-1]).equals(word[i])){
                    return false;
                }else{
                    map.put(patArr[i],word[i]);
                }
            }else if(!map.get(patArr[i]).equals(word[i])){
                return false;
            }
        }
        return true;
    }

}
