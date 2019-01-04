package LinkedListChapter;

/**
 * created by Hannah Li on 19/1/2
 * Project name: LeetcodeProject
 * LeetCode NO.: 141
 */
public class LinkedListCycle {


    /**
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     * Explanation: There is a cycle in the linked list, where tail connects to the second node.
     * 题意：给你一个链表，找出是否它的内部有环形的圆。
     * 思路：来两个指针，一个一次走一步，一个一次走两步，如果第二个能追上第一个就代表有圆。
     */
    public boolean hasCycle2(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }

}
