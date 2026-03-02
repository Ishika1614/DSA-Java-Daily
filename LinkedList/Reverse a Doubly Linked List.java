class Solution {
    public Node reverse(Node head) {
        
        if(head == null || head.next == null){ 
            return head; 
        } 
        
        Node rev = reverse(head.next); 
        head.next.next = head; 
        head.prev = head.next; 
        head.next=null;
        return rev;
         
    }
}
