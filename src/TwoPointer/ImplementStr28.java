package TwoPointer;

/**
 * created by Hannah Li on 19/1/6
 * Project name: LeetcodeProject
 * LeetCode NO.: 28
 */
public class ImplementStr28 {

    public static void main(String[] args){
        String haystack = "hello";
        String needle = "ll";
        System.out.print(strStr(haystack,needle));
    }


    /**
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     */
    public static int strStr(String haystack, String needle) {

        if(needle.length() == 0) return 0;

        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }


}
