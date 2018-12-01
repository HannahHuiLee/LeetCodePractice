package ListCharpter;

/**
 * created by Hannah Li on 18/12/1
 * Project name: LeetcodeProject
 * LeetCode NO.: 206
 */
public class ReverseLinkedList206 {

    static ListNode node = new ListNode(987654);

    public static void main(String[] args) {
        String s = "abba", t = "dog cat cat dog";

        System.out.print(reverseList(node));
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     * <p>
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode temp = head, curr = null, prev = null, temp_next = null;

        while (temp != null) {
            curr = temp;
            temp_next = temp.next;
            temp.next = prev;
            prev = curr;
            temp = temp_next;
        }
        head = prev;
        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

}
