package StringChapter;

/**
 * created by Hannah Li on 2021-09-07
 * Project name: LeetcodeProject
 * LeetCode NO.: 273
 */
public class IntegerToEnglishWords273 {
    public static void main(String[] args) {
        IntegerToEnglishWords273 intToWords = new IntegerToEnglishWords273();
        System.out.println(intToWords.numberToWords(1234567));;
    }

    /**
     * Convert a non-negative integer num to its English words representation.
     * <p>
     * Input: num = 12345------> "Twelve Thousand Three Hundred Forty Five"
     * Input: num = 1234567 -----> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
     */
    //个位和十位
    private final String[] LESSTHAN20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "NineTeen"};
    //十位
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "sixty", "seventy", "Eighty", "Ninety"};
    //单位
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords2(int num) {
        if (num == 0) return "Zero";
        StringBuilder result = new StringBuilder();
        int count = 0; // 记录第几组，方便加单位
        while (num > 0) {
            int threeNum = num % 1000;
            //当前组大于 0 才加单位
            if (threeNum > 0) result.insert(0, " " + THOUSANDS[count]);
            count++;

            int twoNum = num % 100;
            if (twoNum < 20) {
                // 小于20 两位同时考虑
                if (twoNum > 0) result.insert(0, " " + LESSTHAN20[twoNum]);
            } else {
                // 个位
                if (twoNum % 10 > 0) result.insert(0, " " + LESSTHAN20[twoNum % 10]);
                // 十位
                result.insert(0, " " + TENS[twoNum / 10]);
            }

            // 百位
            if (threeNum >= 100) {
                result.insert(0, " Hundred ");
                result.insert(0, " " + LESSTHAN20[threeNum / 100]);
            }
            num /= 1000;
        }
        return result.toString().trim();
    }

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        int i = 0;
        String res = "";
        //1.先把数字以3个为一组分成若干小组
        while (num > 0) {
            if (num % 1000 != 0) {
                res = helper(num % 1000) + THOUSANDS[i] + " " + res;
            }
            i++;
            num /= 1000;
        }
        return res.trim();
    }

    //2. 再小组里面单独处理三位数
    // 1)特殊数 0..19
    // 2)一般两位数 20..99
    // 3)三位数(百位上的数+后面两位)
    private String helper(int n) {
        if (n == 0) {
            return "";
        } else if (n < 20) { // [1-19]
            return LESSTHAN20[n] + " ";
        } else if (n < 100) { //[20, 99]
            return TENS[n / 10] + " " + helper(n % 10);
        } else { //[100 -999]
            return LESSTHAN20[n / 100] + " Hundred " + helper(n % 100);
        }
    }

}
