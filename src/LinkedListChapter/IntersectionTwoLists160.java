package LinkedListChapter;

/**
 * created by Hannah Li on 19/1/3
 * Project name: LeetcodeProject
 * LeetCode NO.: 160
 */
public class IntersectionTwoLists160 {


    /**
     * Write a program to find the node at which the intersection of two singly linked lists begins.
     * 思路一： 先比较两个ListNode的长度。不同则--
     * 注意“==”这个等号表示比对两个对象的引用是否相等。
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null  || headB == null)return null;

        int lenA = len(headA);
        int lenB = len(headB);
        if(lenA > lenB){
            headA = headA.next;
            lenA--;
        }else{
            headB = headB.next;
            lenB--;
        }
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    /**
     * 获取listnode的长度
     */
    public int len(ListNode listNode){
        int len = 1;
        while (listNode.next != null){
            listNode = listNode.next;
            len++;
        }
        return len;
    }



    /**
     * 思路二：每轮循环都将两个链表的标记往后移动一个，当移动到末尾后就跳到另一个链表头再移动，循环的结束条件是两个标记相同。
     *
     *   我们让两条链表分别从各自的开头开始往后遍历，当其中一条遍历到末尾时，我们跳到另一个条链表的开头继续遍历。
     *
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //for the end of first iteration, we just reset the pointer to the head of another linkedlist
        while (a != b){
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }
        return a;
    }




}
