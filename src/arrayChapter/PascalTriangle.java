package arrayChapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by Hannah Li on 18/11/9
 */
public class PascalTriangle {

    public static void main(String[] args) {
        int[] num1 = {1, 3, 4, 5, 0, 0};
        int[] num2 = {7, 9};


        System.out.println(generate(3));

    }

    /**
     *  118. Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
     */
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            list.add(0,1);
            System.out.println(list.toString());
            for(int j = 1; j < list.size() -1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
                System.out.println(list.toString());
            }

        }

        return result;
    }

}
