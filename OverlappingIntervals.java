import java.util.*;
 class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) { 
        
       ArrayList<int[]> result = new ArrayList<>(); 

        if (arr.length == 0)
            return result;

        if (arr.length == 1) {
            result.add(arr[0]);
            return result;
        }
        
        Arrays.sort(arr, Comparator.comparingInt(i->i[0])); 
        
        int[] newInt = arr[0]; 
        result.add(newInt); 
        
        for(int[] interval : arr){ 
            if(interval[0] <=newInt[1]) { 
                newInt[1] = Math.max(newInt[1], interval[1]); 
            } 
            else{ 
                newInt = interval; 
                result.add(newInt);
            } 
        } 
        
        return result;
        
    }
}
