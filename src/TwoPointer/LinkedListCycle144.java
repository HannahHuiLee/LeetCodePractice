package TwoPointer;

/**
 * created by Hannah Li on 2020-10-11
 * Project name: LeetcodeProject
 * LeetCode NO.: 144
 */
public class LinkedListCycle144 {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        System.out.println(hasCycle(head));
    }

    /**
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     * 是否有环
     */
    public static boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode l1 = head, l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null){
            if (l1 == l2) return true;
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


