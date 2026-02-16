// User function Template for Java
import java.util.*;
class Sol {
    public static int search(int n, int arr[]) {
      HashMap<Integer, Integer> map = new HashMap<>(); 
      for(int num : arr){ 
          map.put(num, map.getOrDefault(num,0) +1);
      } 
      for(int key :map.keySet()){ 
          if(map.get(key) == 1){ 
              return key; 
          } 
      } 
      return -1;
        
    }
}
