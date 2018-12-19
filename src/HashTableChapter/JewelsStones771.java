package HashTableChapter;

/**
 * created by Hannah Li on 18/12/18
 * Project name: LeetcodeProject
 * LeetCode NO.: 771
 */
public class JewelsStones771 {


    public static void main(String[] args) {
        String jewel = "z";
        String stones = "ZZ";
        System.out.print(numJewelsInStones(jewel, stones));
    }


    /**
     * Input: J = "aA", S = "aAAbbbb"
     * Output: 3
     * Input: J = "z", S = "ZZ"
     *  Output: 3
     * 16ms --26%
     */
    public static int numJewelsInStones(String J, String S) {
        int[] arr = new int[200];
        for(char jewel : J.toCharArray()){
            arr[jewel]++;
        }
        int c = 0;
        for(char stone : S.toCharArray()){
            if(arr[stone] != 0){
                c++;
            }
        }
        return c;
    }

    /**16ms*/
    public static int numJewelsInStones2(String J, String S) {
        int res = 0;
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();

        for(char jewel: j){
            for(char stone : s){
                if(jewel == stone){
                    res++;
                    continue;
                }
            }
        }
        return res;
    }


    /**[^...] Matches any single character not in brackets.  15ms*/
    public static int numJewelsInStones3(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }



}
