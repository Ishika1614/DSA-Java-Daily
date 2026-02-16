import java.util.*;

class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>(); 
        Arrays.sort(arr);
        int left = 0; 
        int right = arr.length-1; 
        int minDiff = Integer.MAX_VALUE; 
        
        while(left < right) { 
            int sum = arr[left] + arr[right];  
            int diff = Math.abs(target - sum);
            if(diff < minDiff){ 
                minDiff = diff; 
                res.clear(); 
                res.add(arr[left]); 
                res.add(arr[right]); 
            }
            
            
            if(sum < target){ 
                left++; 
            } 
            else{ 
                right--; 
            } 
        } 
        return res;
    }
}
