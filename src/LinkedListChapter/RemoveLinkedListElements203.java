package LinkedListChapter;

/**
 * created by Hannah Li on 19/1/4
 * Project name: LeetcodeProject
 * LeetCode NO.: 203
 */
public class RemoveLinkedListElements203 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

//        System.out.println(removeElements(node1, 5).val);

    }

    /**
     * Remove all elements from a linked list of integers that have value val.
     * Input:  1->2->6->3->4->5->6, val = 6
     * Output: 1->2->3->4->5
     */
    // time: O(n), space: O(1)
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode dummy = pre;

        while (dummy.next != null) {
            if (dummy.next.val == val) {
                dummy.next = head.next.next;
            } else {
                dummy = dummy.next;
            }
        }
        return pre.next;
    }

}
