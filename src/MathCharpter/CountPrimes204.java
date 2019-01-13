package MathCharpter;

/**
 * created by Hannah Li on 19/1/12
 * Project name: LeetcodeProject
 * LeetCode NO.: 204
 */
public class CountPrimes204 {


    public static void main(String[] args) {
        int s = 10;
        System.out.print(countPrimes(s));
    }


    /**
     *Count the number of prime numbers less than a non-negative number, n.
     * Input: 10---->4
     * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     *
     *
     * 因为只需要在每次遇到质数时，将其小于n的倍数都设为非质数，这样就避免了每次遇到一个数都要用之前所有质数去除一遍，大大降低了时间复杂度。
     */
    public static int countPrimes(int n) {
        int result = 0;
        boolean[] notPrime = new boolean[n];
        for(int i = 2; i< n; i++){
            if(notPrime[i] == false){
                result++;
                for(int j =2; j * i < n; j++){
                    notPrime[j * i] = true;
                }
            }
        }
        return result;
    }
}
