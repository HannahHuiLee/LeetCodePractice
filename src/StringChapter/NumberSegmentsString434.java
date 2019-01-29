package StringChapter;

/**
 * created by Hannah Li on 19/1/28
 * Project name: LeetcodeProject
 * LeetCode NO.: 434
 */
public class NumberSegmentsString434 {

    public static void main(String[] args) {
        String strs = "Hello, my name is John";
        String strs2 = ", , , ,        a, eaefa";
        System.out.print(countSegments(strs2));
    }

    /**
     *Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
     * Input: "Hello, my name is John" -->  5
     * 计算给定字符串的片段数，片段由空白字符分割。
     *
     * 陷阱： 两个单词之间有多个空格 不能简单的用split
     *
     */
    public static int countSegments(String s) {
        if(s== null || s.length() == 0) return 0;
        int count = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) != ' '){
                if(i == 0){
                    count++;
                }else if(s.charAt(i-1) == ' '){
                    count++;
                }
            }
        }
        return count;
    }

}
