class Solution {
    public Node segregate(Node head) {
        
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1); 
        
        Node zeroTail = zeroHead;
        Node oneTail = oneHead; 
        Node twoTail = twoHead; 
        
        Node curr = head; 
        
        while(curr != null) { 
            Node newNode = curr.next; 
            curr.next = null;
            
            if(curr.data == 0){ 
                zeroTail.next = curr; 
                zeroTail = zeroTail.next; 
            } 
            else if(curr.data == 1){ 
                oneTail.next = curr; 
                oneTail = oneTail.next; 
            } 
            else { 
                twoTail.next = curr; 
                twoTail = twoTail.next; 
            } 
            
            curr = newNode;   
        } 
        
        zeroTail.next = (oneHead.next != null) ? oneHead.next : twoHead.next; 
        oneTail.next = twoHead.next; 
        
        return zeroHead.next;
    }
}
