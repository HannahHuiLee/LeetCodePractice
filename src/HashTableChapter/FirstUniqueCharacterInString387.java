package HashTableChapter;

/**
 * created by Hannah Li on 18/12/3
 * Project name: LeetcodeProject
 * LeetCode NO.: 387
 */
public class FirstUniqueCharacterInString387 {

    public static void main(String[] args) {
        String s = "leetcode";
        String s1 = "z";
        System.out.print(firstUniqChar2(s1));
    }


    /**
     * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     * s = "leetcode"
     * return 0.
     * <p>
     * s = "loveleetcode",
     * return 2.
     * Note: You may assume the string contain only lowercase letters.
     */
    // 28ms
    public static int firstUniqChar(String s) {

        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (s.indexOf(a[i]) == s.lastIndexOf(a[i])) {
                return i;
            }
        }
        return -1;

    }

    /**
    *  7ms
    */
    public static int firstUniqChar2(String s) {
        int result = s.length();
        for (char c = 'a'; c <= 'z'; c++) {
            int i = s.indexOf(c);
            if (i != -1 && i == s.lastIndexOf(c)) {
                result = Math.min(result, i);
                if(result == 0){
                    break;
                }
            }
        }
        return result == s.length() ? -1 : result;
    }



}
