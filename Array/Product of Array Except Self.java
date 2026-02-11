LEETCODE->238. 
 class Solution {
    public int[] productExceptSelf(int[] nums) { 
        int n = nums.length;
        int[] ans = new int[nums.length]; 
        int prefixSum[] = new int[n];  
        int suffixSum[] = new int[n]; 
        prefixSum[0] = 1; 
        suffixSum[n-1] = 1;
        //creating prefixSum
        for(int i = 1; i<nums.length; i++){ 
            prefixSum[i] =nums[i-1]* prefixSum[i-1];
        }  
        //creating the suffixSum 
        for(int i = n-2; i>=0; i--){ 
            suffixSum[i] = nums[i+1]*suffixSum[i+1];
        } 
        //now final multiplication
        for(int i = 0; i<n; i++){ 
        ans[i] = prefixSum[i]*suffixSum[i];  
        }
        return ans;
     }
}
