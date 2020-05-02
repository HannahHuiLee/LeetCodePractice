package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Hannah Li on 2020-05-02
 * Project name: LeetcodeProject
 * LeetCode NO.: 784
 */
public class LetterCasePermutation784 {

    public static void main(String[] args) {
        LetterCasePermutation784 letterCasePermutation784 = new LetterCasePermutation784();
        List<String> list = letterCasePermutation784.letterCasePermutation("a1b2");
        System.out.println(list.toString());
    }

    /**
     * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.
     * Examples:
     * Input: S = "a1b2"
     * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
     *
     * Input: S = "3z4"
     * Output: ["3z4", "3Z4"]
     *
     * solution: BFS loop
     */
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        list.add(S);
        for(int index = 0; index < S.length(); index++){
            char c = S.charAt(index);
            if(Character.isAlphabetic(c)){
                int L = list.size();
                for(int i = 0; i< L; i++){
                    char temp = Character.isLowerCase(c)? Character.toUpperCase(c): Character.toLowerCase(c);
                    list.add(list.get(i).substring(0, index) + temp + list.get(i).substring(index+1));
                }
            }
        }
        return list;
    }


}
