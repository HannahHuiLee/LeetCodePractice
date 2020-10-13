package top50;

import LinkedListChapter.ListNode;

/**
 * created by Hannah Li on 2020-05-12
 * Project name: LeetcodeProject
 * LeetCode NO.: 2
 */
public class AddTwoNumbers_02 {

    public static void main(String[] args) {
        System.out.println(7 % 10);
        System.out.println(7 / 10);

        int[] arr1 = new int[]{2, 4, 3};
        int[] arr2 = new int[]{5, 6, 4};

//        ListNode listNode1 = new ListNode(arr1);

    }

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     * <p>
     * 取模 + 取余
     * Time: O(n) -- 两个ListNode都遍历一遍
     * Space: O(n)  --  每次需要创建新的ListNode
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int sum = 0;
        ListNode cur = dummy;
        ListNode p1 = l1, p2 = l2;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                sum += p1.val; // 先把2加到sum
                p1 = p1.next;  // 指针挪到4
            }
            if (p2 != null) {
                sum += p2.val; // 把5加到sum
                p2 = p2.next;  //  指针挪到6
            }
            cur.next = new ListNode(sum % 10); // 余数 7   0
            sum /= 10;   // 0 -- 进位   1
            cur = cur.next; // 7   0   8
        }
        if (sum == 1) { // 判断sum超过两位数时  假如排p1中的最后一位为6， 最后一位想加的值为 6+ 4+ 1 = 11   sum = 11/10=1
            cur.next = new ListNode(1); //
        }
        return dummy.next;
    }
}
