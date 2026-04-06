import java.util.*;

class Solution {
    public int findMin(int n) {
        
        int[] coins = {1, 2, 5,10}; 
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0; 
        
        for(int i = 1; i <= n; i++) {
            for(int coin : coins) {
                if(i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        
        return dp[n];
    }
}
