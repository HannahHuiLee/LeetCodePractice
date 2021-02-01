package LinkedListChapter;

/**
 * created by Hannah Li on 18/12/21
 * Project name: LeetcodeProject
 * LeetCode NO.: 21
 */
public class MergeTwoSortedLists21 {


    /**
     * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing
     * together the nodes of the first two lists.
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     * 对于新表声明两个表头，一个是dummy，一个是会挪动的指针，用于拼接。同时，边界条件在后面的补拼中页解决了，所以开头没必要做边界判断，
     * 13 -- 15%
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
        }else{
            current.next = l2;
        }
        return dummy.next;
    }

    /**递归*/
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
