package BinarySearch;

/**
 * created by Hannah Li on 2020-10-14
 * Project name: LeetcodeProject
 * LeetCode NO.: 744
 */
public class FindSmallestLetterGreaterThanTarget744 {

    public static void main(String[] args) {

        FindSmallestLetterGreaterThanTarget744 target744 = new FindSmallestLetterGreaterThanTarget744();
        char[] letters = new char[]{'c', 'f', 'j'};
        System.out.println(target744.nextGreatestLetter(letters, 'a'));

    }

    /**
     * Input: letters = ["c", "f", "j"]
     *        target = "a"
     * Output: "c"
     * 给定一个有序的字符数组 letters 和一个字符 target，要求找出 letters 中大于 target 的最小字符，如果找不到就返回第 1 个字符。
     */
    public char nextGreatestLetter(char[] letters, char target) {
        int i = 0, r = letters.length - 1;
        while (i <= r){
            int mid = i + (r - i)/2;
            if(letters[i] <= target){
                i = mid +1;
            }else {
                r = mid -1;
            }
        }
        return i < r ? letters[i] : letters[0];

    }

}
