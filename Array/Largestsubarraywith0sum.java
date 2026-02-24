import java.util.*;
class Solution {
    int maxLength(int arr[]) {
        
        int maxlen = 0;  
        int prefixSum = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>(); 
        
        for(int i = 0; i<arr.length; i++) { 
            prefixSum+= arr[i]; 
             
             if(prefixSum == 0){ 
                 maxlen = i+1; 
             }
            
             if(map.containsKey(prefixSum) ){
              
                   int len = i- map.get(prefixSum); 
                   maxlen = Math.max(maxlen,len) ;
             }  
             else{
             map.put(prefixSum,i);  
             }
        } 
        return maxlen;
    }
}
