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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head, nNode = head;
        for(int i=0;i<n && node!=null;i++){
            node = node.next;
        }
        if(node==null) 
            return head.next;
        
        while(node.next!=null){
            node=node.next;
            nNode = nNode.next;
        }
        node = nNode.next;
        nNode.next = node.next;
        node.next=null;
        return head;
    }
}