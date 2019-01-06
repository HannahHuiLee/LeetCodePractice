package LinkedListChapter;

/**
 * created by Hannah Li on 19/1/5
 * Project name: LeetcodeProject
 * LeetCode NO.: 234
 */
public class PalindromeLinkedList234 {


    /**
     * 回文
     * Input: 1->2->2->1
     * Output: true
     * <p>
     * time : O(n)
     * space : O(1)
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode middle = findMiddle(head);
        middle.next = reverse(middle.next);

        ListNode p = head;
        ListNode q = middle.next;
        while (p != null && q != null) {
            if (p.val != q.val) return false;
            p = p.next;
            q = q.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    /**
     *  寻找中间的值
     */
    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    /**
     *
     *两个指针都从头出发，快指针每次两步，慢指针每次一步，这样快指针的下一个或下下个为空时，慢指针就在链表正中间那个节点了（如果链表有偶数个节点则在靠近头那侧的）。
     *然后我们从慢指针的下一个开始，把后面的链表都反转（Reverse Linked List），然后我们再从头和从尾同时向中间前进，就可以判断该链表是不是回文了。
     */
    public boolean isPalindrome2(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        // 寻找中点
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // 记录第二段链表的第一个节点
        ListNode secondHead = slow.next;
        ListNode p1 = secondHead;
        ListNode p2 = p1.next;
        // 将第一段链表的尾巴置空
        slow.next = null;
        while(p1 != null && p2 != null){
            ListNode tmp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = tmp;
        }
        // 将第二段链表的尾巴置空
        secondHead.next = null;
        // 依次判断
        while(p1 != null){
            if(head.val != p1.val) return false;
            head = head.next;
            p1 = p1.next;
        }
        return true;
    }



}
