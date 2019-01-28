package StringChapter;

/**
 * created by Hannah Li on 19/1/27
 * Project name: LeetcodeProject
 * LeetCode NO.: 383
 */
public class RansomNote383 {

    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = "aab";
        System.out.print(canConstruct(str1,str2));
    }


    /**
     * 给你一个字符串，问能否用它其中的字符组成另外一个字符串，每个字符只能使用一次。
     * canConstruct("aa", "ab") -> false
     * canConstruct("aa", "aab") -> true
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean ret = true;
        byte[] bytes = new byte[magazine.length()];
        for(int i = 0;i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            boolean found = false;
            for(int j = 0; j < magazine.length(); j++){
                if(bytes[j] == 0 && magazine.charAt(j) == c){
                    bytes[j]++;
                    found = true;
                    break;
                }
            }
            if(!found){
                ret = false;
                break;
            }
        }
        return ret;
    }

}
