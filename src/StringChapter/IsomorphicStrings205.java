package StringChapter;

import java.util.HashMap;

/**
 * created by Hannah Li on 2020-05-09
 * Project name: LeetcodeProject
 * LeetCode NO.: 205
 */
public class IsomorphicStrings205 {

    public static void main(String[] args) {
        IsomorphicStrings205 str = new IsomorphicStrings205();
        System.out.println(str.isIsomorphic("egg", "add"));
    }

    /**
     * Given two strings s and t, determine if they are isomorphic.
     * Two strings are isomorphic if the characters in s can be replaced to get t.
     * <p>
     * Input: s = "egg", t = "add"
     * Output: true
     * Input: s = "foo", t = "bar"
     * Output: false
     */
    // time: O(n), space: O(n)
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) return true;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a).equals(b)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (!map.containsValue(b)) {
                    map.put(a, b);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        int[] sChars = new int[256];
        int[] tChars = new int[256];
        for(int i = 0; i< s.length(); i++){
            if(sChars[s.charAt(i)] != tChars[t.charAt(i)]){
                return false;
            }else{
                sChars[s.charAt(i)] = tChars[t.charAt(i)] = t.charAt(i);
            }
        }
        return true;
    }

}
