class Solution {
    public boolean isPalindrome(Node head) {
     
     Node slow = head; 
     Node fast = head; 
     while(fast!=null && fast.next!=null) {  
         slow=slow.next;
         fast = fast.next.next; 
     } 
      
     Node prev = null;
     while(slow!=null){ 
         Node temp=slow.next; 
         slow.next = prev; 
         prev = slow; 
         slow = temp; 
     } 
     while(prev!=null){ 
         if(head.data!=prev.data) 
         { 
             return false;  
         }
         head = head.next; 
         prev=prev.next; 
     } 
    
    return true;
         
    
        
    }
}
