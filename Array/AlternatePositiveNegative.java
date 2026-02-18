 import java.util.*;
 class Solution {
    void rearrange(ArrayList<Integer> arr) {
       ArrayList<Integer> neg = new ArrayList<>();  
       ArrayList<Integer> pos = new ArrayList<>(); 
       for(int num :arr){ 
           if(num>= 0){ 
               pos.add(num); 
           }  
           else { 
               neg.add(num); 
           } 
       }  
       arr.clear();
      int p = 0; int n = 0;
      while(p < pos.size() && n <neg.size()){  
          
          arr.add(pos.get(p++)); 
          arr.add(neg.get(n++)); 
      } 
         while(p < pos.size()){  
             
             arr.add(pos.get(p++)); 
         } 
          while(n<neg.size()){  
              
             arr.add(neg.get(n++)); 
         
      } 
     
    }
}
