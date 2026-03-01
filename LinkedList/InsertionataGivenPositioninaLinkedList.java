class Solution {
    public Node insertPos(Node head, int pos, int val) { 
        Node newNode = new Node(val); 
        
        if(pos == 1){ 
            newNode.next = head; 
            return newNode; 
        }
        Node temp = head;
        int index = 1;
        while(temp.next != null && index<pos-1) { 
                temp = temp.next; 
                index++; 
            }
                if(temp == null) { 
                    return head;
                }  
                newNode.next = temp.next; 
                temp.next = newNode;  
                
                return head;
                
        
    }
}
