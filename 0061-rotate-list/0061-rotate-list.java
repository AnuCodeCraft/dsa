/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = 1;
        ListNode findsize = head;
        while (findsize.next != null) {
            length++;
            findsize = findsize.next;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }

        ListNode reversed = reverse(head);
        int size = 1;
        ListNode temp = reversed;

        while (size != k) {
            temp = temp.next;
            size++;
        }
        if (temp == null) {
            return reversed;
        }

        ListNode secondHalf = temp.next;
        temp.next = null;

        ListNode ans1 = reverse(reversed);
        ListNode ans2 = reverse(secondHalf);

        ListNode temp2 = ans1;
        while (temp2.next != null) {
            temp2 = temp2.next;

        }
        temp2.next = ans2;

        return ans1;
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode next;
        ListNode prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;

    }
}