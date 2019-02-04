package StringChapter;

/**
 * created by Hannah Li on 19/2/3
 * Project name: LeetcodeProject
 * LeetCode NO.: 551
 */
public class StudentAttendanceRecordI551 {

    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.print(checkRecord(s));
    }

    /**
     *You are given a string representing an attendance record for a student.
     * The record only contains the following three characters:
     * Input: "PPALLP" --》 True
     * 给定一个字符串s，若其中的'A'大于1个，或者出现连续的3个或3个以上'L'，返回False，否则返回True
     */
    public static boolean checkRecord(String s) {
        if(s.indexOf("A") != s.lastIndexOf("A") || s.contains("LLL")){
            return false;
        }
        return true;
    }

}
