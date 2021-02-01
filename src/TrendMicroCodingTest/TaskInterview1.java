package TrendMicroCodingTest;

import java.util.Arrays;

/**
 * created by Hannah Li on 2021-01-23
 */
public class TaskInterview1 {
    public static void main(String[] args) {
        System.out.println(TaskInterview1.solution(new int[]{1,5,3,3,6}));
    }

    public static boolean solution(int[] A) {
        // write your code in Java SE 8
        int[] copyA = Arrays.copyOf(A, A.length);
        Arrays.sort(A);
        int swapCount = 0;
        for(int i = 0; i<A.length;i++){
            if(A[i] != copyA[i]){
                swapCount++;
            }
        }
        return swapCount > 3;
    }

}
