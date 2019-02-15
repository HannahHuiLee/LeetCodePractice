package StringChapter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * created by Hannah Li on 19/2/14
 * Project name: LeetcodeProject
 * LeetCode NO.: 893
 */
public class GroupsSpecialEquivalentStrings893 {


    public static void main(String[] args) {
        String[] s = {"a","b","c","a","c","c"};
        System.out.print(numSpecialEquivGroups(s));
    }

    /**
     * Two strings S and T are special-equivalent if after any number of moves, S == T.
     * Input: ["a","b","c","a","c","c"]  --->  3
     * Explanation: 3 groups ["a","a"], ["b"], ["c","c","c"]
     */
    public static int numSpecialEquivGroups(String[] A) {
        Set<String> groups = new HashSet<>();
        for (String a : A) {
            char[] odd = new char[(a.length() + 1) / 2];
            char[] even = new char[(a.length() + 1) / 2];
            for(int i = 0; i < a.length(); i++){
                if(i % 2 == 0){
                    even[i / 2] = a.charAt(i);
                }else{
                    odd[i / 2] = a.charAt(i);
                }
            }
            Arrays.sort(odd);
            Arrays.sort(even);
            String s = new String(odd) + new String(even);
            groups.add(s);
        }
        return groups.size();
    }
}
