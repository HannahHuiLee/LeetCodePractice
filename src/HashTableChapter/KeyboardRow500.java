package HashTableChapter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Hannah Li on 18/12/8
 * Project name: LeetcodeProject
 * LeetCode NO.: 500
 */
public class KeyboardRow500 {

    public static void main(String[] args) {
        String[] boom = {"Hello", "Alaska", "Dad", "Peace"};
        String[] arr = findWords(boom);
        for(String a : arr){
            System.out.print(a);
        }
    }

    /**
     * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
     * Input: ["Hello", "Alaska", "Dad", "Peace"]
     * Output: ["Alaska", "Dad"]
     */
    public static String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        char[] first = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};
        char[] second = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'};
        char[] third = {'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};

        for (int i = 0; i < words.length; i++) {
            if (findTheWord(first, words[i])) {
                result.add(words[i]);
            }else if(findTheWord(second, words[i])){
                result.add(words[i]);
            }else if(findTheWord(third,words[i])){
                result.add(words[i]);
            }
        }
        return result.toArray(new String[0]);
    }

    private static boolean findTheWord(char[] arr, String word) {
        int len = word.length();
        int count = 0;
        int i = 0;
        while (count<len){
            for(i = 0; i< arr.length; i++){
                if(word.charAt(count) == arr[i]){
                    break;
                }
            }
            if(i ==arr.length){
                return false;
            }
            count++;
        }
        return true;
    }

}
