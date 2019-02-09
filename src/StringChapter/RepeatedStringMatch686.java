package StringChapter;

/**
 * created by Hannah Li on 19/2/8
 * Project name: LeetcodeProject
 * LeetCode NO.: 686
 */
public class RepeatedStringMatch686 {

    public static void main(String[] args) {
        String s = "abcd", s1 = "cdabcdab";
        System.out.print(repeatedStringMatch(s,s1));
    }

    /**
     *Given two strings A and B, find the minimum number of times A
     *  has to be repeated such that B is a substring of it. If no such solution, return -1.
     *判断当A重复一定次数之后，B能否成为其子串。
     *   A = "abcd" and B = "cdabcdab". ---> 3
     */
    public static int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int count = 1;
        while (sb.indexOf(B) == -1){
            if(sb.length() - A.length() > B.length()){
                return -1;
            }
            sb.append(A);
            count++;
        }
        return count;
    }

}
