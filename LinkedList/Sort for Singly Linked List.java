class Solution {
    public static Node insertionSort(Node head) { // merge sort actually
        
        if (head == null || head.next == null) { 
            return head; 
        } 
        
        Node mid = getMid(head); 
        Node rightHead = mid.next;    
        mid.next = null; 
        
        Node left = insertionSort(head); 
        Node right = insertionSort(rightHead);  
        
        return merge(left, right); 
    } 
       
    private static Node merge(Node a, Node b) {   
        Node dummy = new Node(0);
        Node temp = dummy; 
        
        while (a != null && b != null) { 
            if (a.data <= b.data) {  
                temp.next = a;  
                a = a.next;
            } else {
                temp.next = b;  
                b = b.next; 
            } 
            temp = temp.next; 
        } 
        
        if (a != null) temp.next = a; 
        if (b != null) temp.next = b; 
        
        return dummy.next;
    }         
      
    private static Node getMid(Node head) { 
        Node slow = head; 
        Node fast = head.next; 
        
        while (fast != null && fast.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        }
        return slow; 
    }
}
