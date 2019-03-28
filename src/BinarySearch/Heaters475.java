package BinarySearch;

import java.util.Arrays;

/**
 * created by Hannah Li on 19/3/27
 * Project name: LeetcodeProject
 * LeetCode NO.: 475
 */
public class Heaters475 {


    /**
     * Now, you are given positions of houses and heaters on a horizontal line, find out minimum radius
     * of heaters so that all houses could be covered by those heaters.
     */
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        for (int house : houses) {
            int local = binarySearch(heaters, house);
            radius = Math.max(radius, local);
        }
        return radius;
    }

    private int binarySearch(int[] heaters, int target) {
        int l = 0, r = heaters.length - 1;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (heaters[mid] == target) {
                return 0;
            } else if (heaters[mid] < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return Math.min(Math.abs(target - heaters[l]), Math.abs(target - heaters[r]));
    }
}
