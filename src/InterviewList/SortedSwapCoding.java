package InterviewList;




import java.util.Arrays;

/**
 * created by Hannah Li on 2021-01-21
 * Project name: LeetcodeProject
 */
public class SortedSwapCoding {

    public static void main(String[] args) {
        SortedSwapCoding sortedSwapCoding = new SortedSwapCoding();
        System.out.println(sortedSwapCoding.solution(new int[]{1, 5, 3, 3, 7}));
    }

    /**
     * swap once     increase order  & non-decreasing order
     * A = [1,5,3,3,7]    return true
     * A = [1,3,5,3,4]    return false
     */
    public boolean solution(int[] A) {
        int[] aCopy = Arrays.copyOf(A, A.length);
        Arrays.sort(A);

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != aCopy[i]) {
                count++;
            }
        }
        return count<3;
    }
}
