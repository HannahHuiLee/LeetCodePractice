package LinkedListChapter;

/**
 * created by Hannah Li on 19/1/4
 * Project name: LeetcodeProject
 * LeetCode NO.: 203
 */
public class RemoveLinkedListElements203 {


    /**
     *Remove all elements from a linked list of integers that have value val.
     * Input:  1->2->6->3->4->5->6, val = 6
     * Output: 1->2->3->4->5
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        while (p .next!= null){
            if(p.next.val == val){
                p.next = p.next.next;
            }else {
                p = p.next;
            }
        }
        return dummy.next;
    }

}
