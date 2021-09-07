package ArrayChapter;

import java.util.Arrays;

/**
 * created by Hannah Li on 2021-09-06
 * Project name: LeetcodeProject
 * LeetCode NO.: 253
 */
public class MeetingRoomII253 {

    public static void main(String[] args) {
        Interval[] intervals = {new Interval(0, 30),new Interval(5, 10),new Interval(15, 20)};
        System.out.println(minMeetingRooms(intervals));
    }

    /**
     * Given an array of meeting time intervals consisting of start and end times[[s1,e1],[s2,e2],...](si< ei), find the minimum number of conference rooms required.
     *
     * Input: [[0, 30],[5, 10],[15, 20]]
     * Output: 2
     *
     * Input: [[7,10],[2,4]]
     * Output:1
     *
     |___| |____|
     |_____| |___|
     start:
     | |   |   |
     i
     end :
     |   |  |  |
     end

     time : O(nlogn) space : O(n)
     */
    public static int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int res = 0;
        int end = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (starts[i] < ends[end]){
                res++;
            } else {
                end++;
            }
        }
        return res;
    }

}

