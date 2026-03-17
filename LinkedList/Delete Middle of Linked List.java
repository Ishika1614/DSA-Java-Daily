class Solution {
    Node deleteMid(Node head) {
        
        // Edge case
        if (head == null || head.next == null) {
            return null;
        }

       
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2;

        Node curr = head;
        for (int i = 0; i < mid - 1; i++) {
            curr = curr.next;
        }

        // Step 3: delete middle node
        curr.next = curr.next.next;

        return head;
    }
}
