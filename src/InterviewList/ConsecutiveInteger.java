package InterviewList;

/**
 * created by Hannah Li on 2021-01-21
 * Project name: LeetcodeProject
 */
public class ConsecutiveInteger {

    public static void main(String[] args) {
        ConsecutiveInteger consecutiveInteger = new ConsecutiveInteger();
        System.out.println(consecutiveInteger.solution(new int[]{1, 1, 2, 3, 4}, 5));
    }


    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1]) {
                return false;
            }
        }
        if (A[0] != 1 || A[n - 1] != K) {
//        if (A[0] != 1 && A[n - 1] != K) {
            return false;
        } else {
            return true;
        }
    }

}

