
class Solution {
    public int cycleStart(Node head) {  
        
        if(head == null || head.next ==null){ 
            return -1; 
        }
        
        Node slow = head ;
        Node fast = head;  
        
        boolean isloop = false;
        
        while(fast!=null && fast.next!=null) { 
            slow=slow.next; 
            fast=fast.next.next; 
         
        if(slow==fast){ 
            isloop = true; 
            break; 
        }  
        }
        if(!isloop){ 
            return -1; 
        } 
        
        slow = head; 
        
        if(slow == fast) { 
            return head.data; 
        } 
        else{ 
            while(slow.next!=fast.next){ 
                slow=slow.next; 
                fast=fast.next; 
            } 
            return slow.next.data; 
        }
        
    }
}
