

class Solution {
    public int lengthOfLoop(Node head) { 
        int len = 1; 
        
        Node slow = head; 
        Node fast = head;  
        
        boolean isloop = false;
        
        while(fast!= null && fast.next!=null) { 
            slow = slow.next; 
            fast = fast.next.next;  
            
            if(slow == fast){ 
                isloop = true; 
                break; 
            }
        } 
        if(!isloop){ 
          return 0; 
        } 
        
        Node temp = slow.next; 
        while(temp!=slow){ 
            temp = temp.next; 
            len++; 
        }
            return len;
            
            
        
    }
}
