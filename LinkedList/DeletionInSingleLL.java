/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) { 
    
        if(head == null) return head;
         
         if(x == 1){ 
             head = head.next; 
             return head; 
         } 
         Node temp = head; 
         int index = 1; 
         
         while(temp.next!= null && index < x-1) { 
                 temp = temp.next; 
                 index++; 
             } 
             if(temp == null && temp.next == null){ 
                 return head;
         
             }
                temp.next = temp.next.next;
          
         
             return head;
        
    }
}
