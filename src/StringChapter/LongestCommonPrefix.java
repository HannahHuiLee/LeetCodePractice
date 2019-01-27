package StringChapter;

/**
 * created by Hannah Li on 19/1/25
 * Project name: LeetcodeProject
 * LeetCode NO.: 14
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.print(longestCommonPrefix(strs));
    }


    /**
     *Write a function to find the longest common prefix string amongst an array of strings.
     * Input: ["flower","flow","flight"] ---> "fl"
     *
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String res = strs[0];
        for(int i = 0; i< strs.length;i++){
            String cur = strs[i];
            int len = Math.min(res.length(), cur.length());
            res = res.substring(0, len);
            for(int j =0;j <len;j++){
                if(res.charAt(j) != cur.charAt(j)){
                    res = res.substring(0, j);
                    break;
                }
            }
        }
        return res;
    }

}
