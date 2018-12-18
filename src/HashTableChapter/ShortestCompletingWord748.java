package HashTableChapter;

/**
 * created by Hannah Li on 18/12/17
 * Project name: LeetcodeProject
 * LeetCode NO.: 748
 */
public class ShortestCompletingWord748 {

    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        String[] words = {"looks", "pest", "stew", "show"};
        ShortestCompletingWord748 s = new ShortestCompletingWord748();

        System.out.print(s.shortestCompletingWord(licensePlate, words));
    }

    /**
     * Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
     * Output: "pest"
     * Explanation: There are 3 smallest length words that contains the letters "s".
     * We return the one that occurred first.
     * HashTable > Array
     */
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String target = licensePlate.toLowerCase();
        int[] charMap = new int[26];
        // Construct the character map
        for (int i = 0; i < target.length(); i++) {
            if (Character.isLetter(target.charAt(i))) {
                charMap[target.charAt(i) - 'a']++;
            }
        }
        int minLength = Integer.MAX_VALUE;
        String result = null;
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (matches(word, charMap) && word.length() < minLength) {
                minLength = word.length();
                result = words[i];
            }
        }
        return result;
    }

    private boolean matches(String word, int[] charMap) {
        int[] targetMap = new int[26];
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                targetMap[word.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (charMap[i] != 0 && targetMap[i] < charMap[i]) return false;
        }
        return true;
    }


}
