package LinkedListChapter;

/**
 * created by Hannah Li on 19/1/5
 * Project name: LeetcodeProject
 * LeetCode NO.: 876
 */
public class MiddleLinkedList876 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println(middleNode(node1).val);
    }

    /**
     *Given a non-empty, singly linked list with head node head, return a middle node of linked list.
     *If there are two middle nodes, return the second middle node.
     * Input: [1,2,3,4,5] --- Output: 3
     * Input: [1,2,3,4,5,6]  ---- Output: 4
     *       Since the list has two middle nodes with values 3 and 4, we return the second one.
     */
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
