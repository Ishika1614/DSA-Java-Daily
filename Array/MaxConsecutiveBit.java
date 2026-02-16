class Solution {
    public int maxConsecBits(int[] arr) { 
        if(arr.length == 0) return 0;
    
    int maxConsecutive = 1; 
    int count = 1; 
    for(int i = 0; i<arr.length-1; i++) { 
        if(arr[i] == arr[i+1]){ 
            count++;  
        } 
        else{ 
            count = 1; 
        }
            maxConsecutive = Math.max(maxConsecutive,count);
    } 
    return maxConsecutive;
        
    }
}
