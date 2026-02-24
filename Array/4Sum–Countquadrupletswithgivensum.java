import java.util.*;
class Solution {
    public int countSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0; 
        
        
      for(int i = 0; i<arr.length; i++) { 
          for(int j = i+1; j<arr.length; j++) { 
              int sum = arr[i] + arr[j]; 
              
              int rem = target- sum; 
              
              if(map.containsKey(rem)){ 
                  count+=map.get(rem); 
              } 
          }
      
         for(int j = 0; j<i;j++){ 
             int sum = arr[i] +arr[j]; 
             map.put(sum, map.getOrDefault(sum,0)+1); 
         } 
      }
      return count;
    }
}
