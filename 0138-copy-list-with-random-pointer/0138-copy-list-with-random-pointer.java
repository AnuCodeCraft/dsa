/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null) {
            return null;
        }

        // Map: Original node -> Copied node
        HashMap<Node, Node> map = new HashMap<>();

        // Step 1: Create copy of each node
        Node curr = head;

        while(curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Step 2: Connect next and random pointers
        curr = head;

        while(curr != null) {

            Node copiedNode = map.get(curr);

            copiedNode.next = map.get(curr.next);
            copiedNode.random = map.get(curr.random);

            curr = curr.next;
        }

        // Return copied head
        return map.get(head);
        
    }
}