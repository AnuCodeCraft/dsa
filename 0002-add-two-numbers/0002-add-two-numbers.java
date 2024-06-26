/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tempSum;
        ListNode root = new ListNode();

        int overflow;
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        ListNode temp = root;

        while (currentNode1 != null || currentNode2 != null) {
            tempSum = temp.val + (currentNode1 != null ? currentNode1.val : 0) + (currentNode2 != null ? currentNode2.val : 0);

            if (tempSum > 9) {
                overflow = tempSum - 10;
                temp.val = overflow;
                temp.next = new ListNode(1);
            } else {
                temp.val = tempSum;
                temp.next = new ListNode(0);
            }

            currentNode1 = currentNode1 != null ? currentNode1.next :                  null;
            currentNode2 = currentNode2 != null ? currentNode2.next :                   null;

            if (currentNode1 != null || currentNode2 != null) {
                temp = temp.next;
            } else {
                if (temp.next.val == 0) {
                    temp.next = null;
                }
            }
        }

        return root;
    }
}