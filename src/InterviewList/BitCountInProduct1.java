package InterviewList;

/**
 * created by Hannah Li on 2021-01-21
 * Project name: LeetcodeProject
 * LeetCode NO.:
 */
public class BitCountInProduct1 {

    public static void main(String[] args) {
        BitCountInProduct1 bitCountInProduct1 = new BitCountInProduct1();
        System.out.println(bitCountInProduct1.solution(3, 7));
    }

    /**
     * given A = 3 and B = 7  the function should return 3
     * reason: 3*7=21    (10101)
     *
     * words:  divisor(除数)    dividend(被除数)     quotient(商)     remainder(余数)
     */
    public int solution(int A, int B) {
        if (A == 0 || B == 0) return 0;

        int multipleNum = A * B;
        int count = 0;
        do {
            int remainder = multipleNum % 2;
            if(remainder == 1){
                count++;
            }
            multipleNum = multipleNum / 2;

        }while (multipleNum != 0);

        return count;
    }
}
