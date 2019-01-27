package StringChapter;

/**
 * created by Hannah Li on 19/1/26
 * Project name: LeetcodeProject
 * LeetCode NO.:v38
 */
public class CountSay38 {

    public static void main(String[] args) {
        int num = 5;
        System.out.print(countAndSay(num));
    }

    /**
     * The count-and-say sequence is the sequence of integers with the first five terms as following:
     */
    public static String countAndSay(int n) {
        int i = 1;
        String res = "1";
        while (i < n) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            char c = res.charAt(0);
            for (int j = 0; j <= res.length(); j++) {
                if (j != res.length() && res.charAt(j) == c) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(c);
                    if (j != res.length()) {
                        count = 1;
                        c = res.charAt(j);
                    }
                }
            }
            res = sb.toString();
            i++;
        }
        return res;
    }


}
