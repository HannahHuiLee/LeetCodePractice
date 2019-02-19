package StringChapter;

import java.util.HashSet;
import java.util.Set;

/**
 * created by Hannah Li on 19/2/18
 * Project name: LeetcodeProject
 * LeetCode NO.: 929
 */
public class UniqueEmailAddresses929 {

    public static void main(String[] args) {
        String[] s = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.print(numUniqueEmails(s));
    }


    /**
     * Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
     * Output: 2
     * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
     */
    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>();
        for(String email : emails){
            String[] arr = email.split("@");
            String local = arr[0];
            int index = local.indexOf("+");
            if(index > 0){
                local = local.substring(0, index);
            }
            local = local.replaceAll("\\.","");
            set.add(local +"@"+ arr[1]);
        }
        return set.size();
    }

}
