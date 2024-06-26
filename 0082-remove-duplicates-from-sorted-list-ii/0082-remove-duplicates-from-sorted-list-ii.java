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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) return head;
        
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        
        ListNode prevNode = dummyNode;
        ListNode currNode = head;

        while (currNode != null) {
            if(currNode.next != null && currNode.val == currNode.next.val){
                while(currNode.next != null && currNode.val == currNode.next.val){
                    currNode = currNode.next;
                    prevNode.next = currNode.next;
                }
            }else{
                prevNode = currNode;
            };

            currNode = currNode.next;
        }

        return dummyNode.next;

    }
}