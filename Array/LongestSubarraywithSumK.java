// User function Template for Java
import java.util.*;
class Solution {
    public int longestSubarray(int[] arr, int k) {
      
      HashMap<Integer, Integer> map = new HashMap<>();    
      map.put(0,-1); 
      int sum = 0; 
      int maxLen = 0;
      
      for(int i = 0; i<arr.length; i++){ 
          sum+=arr[i]; 
          int rem = sum - k; 
          if(map.containsKey(rem)){ 
              int len = i - map.get(rem); 
              maxLen = Math.max(maxLen, len); 
          } 
          if(!map.containsKey(sum)){ 
              map.put(sum, i); 
          }
      } 
      return maxLen;
          
        
    }
}
