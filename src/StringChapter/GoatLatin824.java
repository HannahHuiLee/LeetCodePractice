package StringChapter;

/**
 * created by Hannah Li on 19/2/12
 * Project name: LeetcodeProject
 * LeetCode NO.: 824
 */
public class GoatLatin824 {


    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        System.out.print(toGoatLatin(s));
    }


    /**
     * A sentence S is given, composed of words separated by spaces.
     * Each word consists of lowercase and uppercase letters only.
     * Input: "I speak Goat Latin"
     * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
     */
    public static String toGoatLatin(String S) {
        String[] words = S.split(" ");
        String vowels = "aeiouAEIOU";
        String finalSentence = "";
        int count = 1;
        for (String word : words) {
            if (vowels.indexOf(word.charAt(0)) != -1) {
                finalSentence += word + "ma";
            } else {
                finalSentence += word.substring(1, word.length()) + word.charAt(0) + "ma";
            }
            for (int i = 0; i < count; i++) {
                finalSentence += "a";
            }
            finalSentence += " ";
            count++;
        }
        return finalSentence.substring(0, finalSentence.length() -1);
    }
}
