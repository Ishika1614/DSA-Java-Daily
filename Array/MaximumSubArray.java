import java.util.*;

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        long sum = 0;
        long maxSum = -1;
        
        for(int i = 0; i < arr.length; i++) {
            
            if(arr[i] >= 0) {
                sum += arr[i];
                temp.add(arr[i]);
            } 
            else {
                if(sum > maxSum || 
                   (sum == maxSum && temp.size() > list.size())) {
                    
                    maxSum = sum;
                    list = new ArrayList<>(temp);
                }
                
                sum = 0;
                temp.clear();
            }
        }
        
        
        
        if(sum > maxSum || 
           (sum == maxSum && temp.size() > list.size())) {
            
            list = new ArrayList<>(temp);
        }
        
        if(list.size() == 0) {
            list.add(-1);
        }
        
        return list;
    }
}
