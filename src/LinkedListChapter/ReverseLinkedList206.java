package LinkedListChapter;

/**
 * created by Hannah Li on 19/1/4
 * Project name: LeetcodeProject
 * LeetCode NO.: 206
 */
public class ReverseLinkedList206 {
    /**
     *Reverse a singly linked list.
     *Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     * 用一个新的值分别储存其中要使用的值
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev, curr, next;
        prev = null;
        curr = head;
        next = null;

        while (curr != null){
            next =  curr.next; // 2     3     4
            curr.next = prev; // null   1     1
            prev = curr;      // 1      1
            curr = next;      // 2      3
        }
        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public ListNode reverseList3(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
