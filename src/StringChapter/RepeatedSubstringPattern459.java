package StringChapter;

/**
 * created by Hannah Li on 19/1/30
 * Project name: LeetcodeProject
 * LeetCode NO.: 459
 */
public class RepeatedSubstringPattern459 {


    public static void main(String[] args) {
        String s = "aabaaba";
        System.out.print(repeatedSubstringPattern2(s));
    }

    /**
     * Given a non-empty string check if it can be constructed by
     * taking a substring of it and appending multiple copies of the substring together.
     * Input: "abab" -->  True
     */
    public static boolean repeatedSubstringPattern2(String s) {
        int l = s.length();
        for(int i=l/2;i>=1;i--) {
            if(l%i==0) {
                int m = l/i;
                String subS = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(subS);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }

}
