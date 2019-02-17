package StringChapter;

/**
 * created by Hannah Li on 19/2/16
 * Project name: LeetcodeProject
 * LeetCode NO.: 925
 */
public class LongPressedName925 {


    public static void main(String[] args) {
        String a = "saeed", b = "ssaaedd";
        System.out.print(isLongPressedName2(a, b));
    }


    /**
     * Your friend is typing his name into a keyboard.  Sometimes, when typing a character c,
     * the key might get long pressed, and the character will be typed 1 or more times.
     * Input: name = "saeed", typed = "ssaaedd" --> false
     * Input: name = "alex", typed = "aaleex" --->  true
     */
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, m = name.length(), n = typed.length();
        for (int j = 0; j < n; j++) {
            if (i < m && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
        }
        return i == m;
    }


    public static boolean isLongPressedName2(String name, String typed) {
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if(j == typed.length() && i != name.length()){
            return false;
        }
        return true;
    }


}
