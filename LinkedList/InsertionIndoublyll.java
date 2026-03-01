class Solution {
    public Node insertAtPos(Node head, int pos, int data) {
        
        Node newNode = new Node(data);
        Node temp = head;
        int index = 0;

        // Traverse till index pos
        while(temp != null && index < pos) {
            temp = temp.next;
            index++;
        }

        if(temp == null) return head;

        newNode.next = temp.next;
        newNode.prev = temp;

        if(temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        return head;
    }
}
