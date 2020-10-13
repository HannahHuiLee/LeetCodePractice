package arrayChapter;

/**
 * created by Hannah Li on 18/11/20
 * Project name: LeetcodeProject
 * LeetCode NO.: 605
 */
public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,0,0};
        System.out.print(canPlaceFlowers(nums,2));
    }

    /**
     * Suppose you have a long flowerbed in which some of the plots are planted and some are not.
     * However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
     * <p>
     * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
     * and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule
     * Input: flowerbed = [1,0,0,0,1], n = 1
     * Output: True
     * Input: flowerbed = [1,0,0,0,1], n = 2
     * Output: False
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean available = true;
                if (i - 1 >= 0 && flowerbed[i - 1] == 1) {   // 左边
                    available = false;
                } else if (i + 1 <= flowerbed.length-1 && flowerbed[i + 1] == 1) {   // 左边
                    available = false;
                }

                if (available) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;

    }

}
