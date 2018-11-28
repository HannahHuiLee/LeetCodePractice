package arrayChapter;

/**
 * created by Hannah Li on 18/11/27
 * Project name: LeetcodeProject
 * LeetCode NO.: 867
 */
public class TransposeMatrix867 {

    public static void main(String[] args) {
        int[][] numbs = {{4,3,8,4},{9,5,1,9},{2,7,6,2}};
        int[][] transpose = transpose(numbs);
        for (int i = 0; i< transpose.length;i++){
            for(int j = 0; j<transpose[i].length; j++){
                System.out.print(transpose[i][j]);
            }
        }

    }

    /**
     * Given a matrix A, return the transpose of A.
     * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
     * Input: [[1,2,3],[4,5,6]]
     * Output: [[1,4],[2,5],[3,6]]
     */
    public static int[][] transpose(int[][] A) {

        if(A == null) return null;

        int [][] B = new int[A[0].length][];
        for(int i = 0; i< A[0].length; i++){
            B[i] = new int[A.length];
        }
        for(int i = 0; i <A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                B[j][i] = A[i][j];
            }
        }
        return B;
    }

}
