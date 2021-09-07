package ArrayChapter;

import java.util.Arrays;
import java.util.Comparator;

/**
 * created by Hannah Li on 2021-09-07
 * Project name: LeetcodeProject
 * LeetCode NO.: 252
 */
public class MeetingRoom252 {
    public static void main(String[] args) {
        Interval[] intervals = {new Interval(0, 30),new Interval(5, 10),new Interval(15, 20)};
        System.out.println(canAttendMeetings(intervals));
    }

    /**
     * Given an array of meeting time intervals consisting of start and end times[[s1,e1],[s2,e2],...](si< ei), determine if a person could attend all meetings.
     * Input: [[0,30],[5,10],[15,20]]  ----> Output: false
     * Input: [[7,10],[2,4]]  ----> Output:true
     */

    public static boolean canAttendMeetings(Interval[] intervals) {
//        Arrays.sort(intervals, (x, y) -> x.start - y.start);
        Arrays.sort(intervals, Comparator.comparingInt(x -> x.start));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start) return false;
        }
        return true;
    }
}
