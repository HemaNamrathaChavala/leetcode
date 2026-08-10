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
        if (head == null) {
            return null;
        }

        Node curr = head;

        // Step 1: Insert copy nodes
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;

            curr = copy.next;
        }

        // IMPORTANT: Reset curr
        curr = head;

        // Step 2: Set random pointers
        while (curr != null) {
            Node copy = curr.next;

            if (curr.random != null) {
                copy.random = curr.random.next;
            }

            curr = copy.next;
        }

        // Step 3: Separate lists
        curr = head;
        Node clonedHead = head.next;

        while (curr != null) {
            Node copy = curr.next;

            curr.next = copy.next;

            if (copy.next != null) {
                copy.next = copy.next.next;
            }

            curr = curr.next;
        }

        return clonedHead;
    }
}
