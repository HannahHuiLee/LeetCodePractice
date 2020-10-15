package Greedy;

import ArrayChapter.CanPlaceFlowers;

/**
 * created by Hannah Li on 2020-10-14
 * Project name: LeetcodeProject
 * LeetCode NO.: 605
 */
public class CanPlaceFlowers605 {

    public static void main(String[] args) {
        CanPlaceFlowers605 canPlaceFlowers605 = new CanPlaceFlowers605();
        int[] flowerbed = new int[]{1,0,0,0,1};
        System.out.println(canPlaceFlowers605.canPlaceFlowers(flowerbed, 1));
    }

    /**
     * Input: flowerbed = [1,0,0,0,1], n = 1
     * Output: True
     * flowerbed 数组中 1 表示已经种下了花朵。花朵之间至少需要一个单位的间隔，求解是否能种下 n 朵花。
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        int i = 0, count = 0, len = flowerbed.length;
        while (i < len) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == len - 1 || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
    }

}
