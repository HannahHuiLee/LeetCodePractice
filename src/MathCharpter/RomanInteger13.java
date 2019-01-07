package MathCharpter;

/**
 * created by Hannah Li on 19/1/7
 * Project name: LeetcodeProject
 * LeetCode NO.: 13
 */
public class RomanInteger13 {

    /**
     *Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * Input: "LVIII" ---> 58
     *      Explanation: L = 50, V= 5, III = 3.
     *
     * 规律： 左边的数字小于右边的数字 =  右边- 左边  ：  IV ：4    ；    VI ： 6
     */
    public int romanToInt(String s) {
        if(s == null || s.length() == 0) return 0;
        int res = toNumber(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(toNumber(s.charAt(i)) > toNumber(s.charAt(i-1))){
               res += toNumber(s.charAt(i)) - 2 * toNumber(s.charAt(i-1));
            }else{
                res += toNumber(s.charAt(i));
            }
        }
        return res;
    }

    public int toNumber(char c){
        int res = 0;
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return res;
    }

}
