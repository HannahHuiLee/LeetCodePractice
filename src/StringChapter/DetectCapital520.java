package StringChapter;

/**
 * created by Hannah Li on 19/1/31
 * Project name: LeetcodeProject
 * LeetCode NO.: 520
 */
public class DetectCapital520 {


    public static void main(String[] args) {
        String s = "FlaG";
        System.out.print(detectCapitalUse(s));
    }

    /**
     *Given a word, you need to judge whether the usage of capitals in it is right or not.
     * Input: "USA" ---》 True
     * Input: "FlaG" --》 False
     *
     */
    public static boolean detectCapitalUse(String word) {
        if(word == null || word.length()<2) return true;

        //All upper case && All lower case
        if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word)){
            return true;
        }

        //Only first letter capital
        if(Character.isUpperCase(word.charAt(0)) && word.substring(1).toLowerCase().equals(word.substring(1))){
            return true;
        }
        return false;
    }

}
