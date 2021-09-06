package ArrayChapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * created by Hannah on 21/9/3
 * Project name: interview
 */
public class MoveZeroesToCenter {

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 5, 0, 7, 8};
        moveZeroesToCenter2(nums);
    }

    /**
     * Given an array nums, write a function to move all 0's to the center of it while maintaining the relative order of the non-zero elements.
     * Input: [0, 1, 3, 5, 0, 7, 8, 0]
     * Output: [1, 3, 5, 0, 0, 0, 7, 8]
     */
    public static void moveZeroesToCenter2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
                nums[i] = 0;
            }
        }

        int indexInit = 0;
        for (int i = 0; i <= list.size() / 2; i++) {
            nums[indexInit] = list.get(i);
            indexInit++;
        }

        indexInit = nums.length - 1;
        for (int i = list.size() - 1; i > list.size() / 2; i--) {
            nums[indexInit] = list.get(i);
            indexInit--;
        }
        System.out.println(Arrays.toString(nums));
    }


    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void moveZeroesToCenter(int[] nums) {
        int numberOfZeroes = 0;

        // count the number of zeroes
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) numberOfZeroes++;
        }

        // determine the range of zeroes
        int startIndex = nums.length - numberOfZeroes;
        int endIndex = startIndex + numberOfZeroes - 1;

        // move some non-zero values to the left of the array
        int j = 0;
        for (int i = 0; i < startIndex; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // move some non-zero values to the right of the array
        j = nums.length - 1;
        for (int i = nums.length - 1; i > endIndex; i--) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j--;
            }
        }

        for (int i = startIndex; i < endIndex + 1; i++) {
            nums[j] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

}
