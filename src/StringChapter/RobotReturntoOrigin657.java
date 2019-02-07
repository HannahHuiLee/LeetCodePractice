package StringChapter;

/**
 * created by Hannah Li on 19/2/6
 * Project name: LeetcodeProject
 * LeetCode NO.: 657
 */
public class RobotReturntoOrigin657 {

    public static void main(String [] args){
        String s = "UD";
        System.out.print(judgeCircle(s));
    }


    /**
     *There is a robot starting at position (0, 0), the origin, on a 2D plane.
     * Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
     * 给一个字符串, 每个字符包含 “U”、”D”、”L”、”R”, 分别表示上下左右，表示机器人向这个位置走一步,
     * 判断最终是否机器人是否还在原来的位置。
     * Input: "UD" ---》 true
     * Input: "LL" ---》 false
     */
    public static boolean judgeCircle(String moves) {
        int i = 0;
        int j = 0;
        char[] chars = moves.toCharArray();
        for(char ch : chars){
            if(ch == 'U'){
                i+=1;
            }else if(ch == 'D'){
                i -=1;
            }else if(ch == 'L'){
                j -= 1;
            }else if(ch == 'R'){
                j += 1;
            }
        }
        return i == 0 && j ==0;
    }

}
