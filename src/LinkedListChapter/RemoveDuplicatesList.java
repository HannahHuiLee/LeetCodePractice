package LinkedListChapter;

/**
 * created by Hannah Li on 18/12/22
 * Project name: LeetcodeProject
 * LeetCode NO.: 83
 */
public class RemoveDuplicatesList {


    /**
     *Given a sorted linked list, delete all duplicates such that each element appear only once.
     *Input: 1->1->2->3->3
     * Output: 1->2->3
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(head != null && head.next != null) {
            while(head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        return current;
    }


    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }


}
