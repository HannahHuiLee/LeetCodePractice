package LinkedListChapter;

/**
 * created by Hannah Li on 19/1/5
 * Project name: LeetcodeProject
 * LeetCode NO.: 876
 */
public class MiddleLinkedList {


    /**
     *Given a non-empty, singly linked list with head node head, return a middle node of linked list.
     *If there are two middle nodes, return the second middle node.
     * Input: [1,2,3,4,5] --- Output: 3
     * Input: [1,2,3,4,5,6]  ---- Output: 4
     *       Since the list has two middle nodes with values 3 and 4, we return the second one.
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
