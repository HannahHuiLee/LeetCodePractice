package LinkedListChapter;

/**
 * created by Hannah Li on 19/1/5
 * Project name: LeetcodeProject
 * LeetCode NO.:237
 */
public class DeleteNodeLinkedList237 {


    /**
     * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
     * Input: head = [4,5,1,9], node = 5
     * Output: [4,1,9]
     * Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
     */
    public void deleteNode(ListNode node) {
        if(node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }


}
