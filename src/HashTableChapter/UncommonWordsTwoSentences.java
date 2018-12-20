package HashTableChapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * created by Hannah Li on 18/12/19
 * Project name: LeetcodeProject
 * LeetCode NO.: 884
 */
public class UncommonWordsTwoSentences {

    public static void main(String[] args) {
        String a = "this apple is sweet";
        String b = "this apple is sour";
        System.out.print(Arrays.toString(uncommonFromSentences(a, b)));
    }

    /**
     * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
     * Input: A = "this apple is sweet", B = "this apple is sour"
     * Output: ["sweet","sour"]
     * 如果一个词在一句话中只出现了一次，在另外一句话中没出现，那么这个词是不同的词。找出两句话中所有不同的词。
     * 10ms --24%
     */
    public static String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for (String w : (A + " " + B).split(" ")) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }
        ArrayList<String> res = new ArrayList<>();
        for (String w : count.keySet()) {
            if (count.get(w) == 1) res.add(w);
        }
        return res.toArray(new String[0]);
    }

}
