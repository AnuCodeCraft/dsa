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
    public boolean isPalindrome(ListNode head) {

        // step 1 : find the middle element
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        if (fastPointer != null) {
            slowPointer = slowPointer.next;
        }

        // step2 : reverse the other half of the linked List
        slowPointer = reverse(slowPointer);
        fastPointer = head;

        // step 3 : compare the both halves values
        while (slowPointer != null) {
            if (slowPointer.val != fastPointer.val) {
                return false;
            }
            ;

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        return true;
    }

    // helper function to reverse the linkedList
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}