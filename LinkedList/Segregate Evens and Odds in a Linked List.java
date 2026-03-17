class Solution {
    Node divide(Node head) {
        Node even = null; 
        Node odd = null;
        Node o = null; 
        Node e = null;  

        while (head != null) { 
            Node nextNode = head.next; 
            head.next = null;         

            if (head.data % 2 == 0) {  
                if (even == null) {  
                    even = head; 
                    e = head;  
                } else {  
                    e.next = head;
                    e = e.next;
                } 
            } else { 
                if (odd == null) { 
                    odd = head; 
                    o = head; 
                } else { 
                    o.next = head; 
                    o = o.next; 
                } 
            }  

            head = nextNode; 
        } 
        
        if (e != null) { 
            e.next = odd; 
        } 
          
        return (even != null) ? even : odd;
    }
}
