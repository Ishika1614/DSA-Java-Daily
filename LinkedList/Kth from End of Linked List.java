/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    int getKthFromLast(Node head, int k) {
       Node temp = head;   
       int count = 1;
       while(temp.next!=null) { 
           temp = temp.next;
            count++;
       } 
       if(k>count){ 
           return -1; 
       } 
       
        Node prev = null;  
        
        Node curr = head;
        while(curr!=null) { 
            Node t = curr.next;  
            curr.next = prev; 
            
            prev = curr; 
            curr = t; 
        }   
        Node newNode = prev;
        for(int i =1; i<k; i++) { 
            newNode = newNode.next; 
        } 
        return newNode.data;
            
    }
}
