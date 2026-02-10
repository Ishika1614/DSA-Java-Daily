 import java.util.*;
 class Solution {
    public int maxProduct(int[] nums) {  

     int maxProduct = nums[0]; 
     int currentProduct = nums[0]; 
     int prevProduct = nums[0];
      
      for(int i = 1; i<nums.length; i++) {  
        int temp = currentProduct;
        currentProduct = Math.max(nums[i],  Math.max(nums[i]*currentProduct , nums[i] *prevProduct));  
        prevProduct = Math.min(nums[i], Math.min(nums[i]*temp,nums[i]*prevProduct));
        maxProduct = Math.max(maxProduct, currentProduct);
      }
      return maxProduct;
    }
}
